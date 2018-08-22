package com.zhanghao.program1;


import com.zhanghao.domain.CityUrl4LianJia;
import com.zhanghao.domain.HouseDetail4LianJia;
import com.zhanghao.jdbc.JDBCHelper;
import com.zhanghao.uitls.JsoupUtil;
import com.zhanghao.uitls.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Administrator on 2018/8/16/016.
 */
public class HouseOfLianJia {

    public static  List<CityUrl4LianJia> getCityUrl4LianJia(Document document ){
        List<CityUrl4LianJia> list = new ArrayList<CityUrl4LianJia>();
        Elements es =   document.select("div.city-enum.fl");
        //System.out.println(e.toString());
        for(Element e : es ){
            for(Element x : e.children()){
               CityUrl4LianJia culj = new CityUrl4LianJia(x.text(),x.attr("title"),x.attr("href"));
                //Object[] obj = new Object[]{x.text(),x.attr("title"),x.attr("href")};
                list.add(culj);
//                System.out.println();
//                System.out.println(x.text()) ;
//                System.out.println(x.attr("title")) ;
//                System.out.println(x.attr("href")) ;
            }
        }

        return list ;
    }

    public static List<HouseDetail4LianJia> getHouseDetail4LianJia(Document document) {
        List<HouseDetail4LianJia> list = new ArrayList<HouseDetail4LianJia>();
        Elements es =document.select("li.clear.LOGCLICKDATA");
        for(Element e :es){



            //����
            Element title =e.select("div.title").first();
            String house_url =title.child(0).attr("href");
            String titleName =title.child(0).ownText();

//            System.out.println(house_url);
//            System.out.println(titleName);
            //houseinfo
            Element houseInfo_e =e.select("div.houseInfo").first();
            String[] houseInfo= houseInfo_e.text().split("\\|");
//            int len = houseInfo.length;
            int tmp=0;
            for(int i =0; i<houseInfo.length;i++){
                if (houseInfo[i].contains("室")&&houseInfo[i].contains("厅")){
                    tmp =i;
                    break;
                }
            }
           // System.out.println(tmp);
                String xiaoqu = StringUtil.ifNull(houseInfo,0,null);
                String shihu =  StringUtil.ifNull(houseInfo, 0+tmp, null);
//                double size =0;
                double size = Double.parseDouble( StringUtil.ifNull(houseInfo,1+tmp,"0").replace("平米",""));

                String direction = StringUtil.ifNull(houseInfo, 2+tmp, null);
                String  style = StringUtil.ifNull(houseInfo, 3+tmp, null);
                String  lift = StringUtil.ifNull(houseInfo, 4+tmp, null);


            //System.out.println(houseInfo_e.text()+"   " +houseInfo[2] );
            //floodo
            Element flood_e =e.select("div.flood").first();
            String[] floor= flood_e.text().split("-");
            String detail = StringUtil.ifNull(floor, 0, null);
            String address = StringUtil.ifNull(floor, 1, null);
//            System.out.println(flood_e.text());
            //tag
            Element tag_e =e.select("div.tag").first();
            StringBuilder tags =new StringBuilder("");
            int tag_num =0;
            for(Element everyTag : tag_e.children()){
                tags.append(everyTag.text().trim()).append("|");
                tag_num++;
            }
            String house_tags =tag_num>0 ?tags.substring(0,tags.length()-1) : "";
//            System.out.println(house_tags);
            //price
            String  totalPrice =e.select("div.totalPrice").first().child(0).ownText().trim();
            String unitPrice =e.select("div.unitPrice").first().attr("data-price");
            //System.out.println(totalPrice);
//            System.out.println(unitPrice);

            HouseDetail4LianJia hdlj =new HouseDetail4LianJia(
                    titleName,house_url,xiaoqu,shihu,size,direction,style,
                    lift,detail,address,house_tags,Double.parseDouble(totalPrice),Double.parseDouble(unitPrice));

            //System.out.println(hdlj);

            list.add(hdlj);
        }


     return list;
    }

    public static void main(String[] args){
        try {
           Document d = JsoupUtil.getHTMLTextByUrl("https://qd.lianjia.com/ershoufang");

            HouseOfLianJia.getHouseDetail4LianJia(d);


        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}
