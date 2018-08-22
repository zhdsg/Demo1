package com.zhanghao.dao.impl;

import com.zhanghao.dao.LianJiaDao;
import com.zhanghao.domain.CityUrl4LianJia;
import com.zhanghao.domain.HouseDetail4LianJia;
import com.zhanghao.jdbc.JDBCHelper;
import com.zhanghao.program1.HouseOfLianJia;
import com.zhanghao.uitls.JsoupUtil;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/8/16/016.
 */
public class LianJiaDaoImpl implements LianJiaDao {

    JDBCHelper jdbcHelper =JDBCHelper.getInstance();

    public void insertCityUrl4LianJia(List<CityUrl4LianJia> list) {
        List<Object[]> objs = new ArrayList<Object[]>();
         String sql = "replace into lj_city (city_name,city_title,city_url) values (?,?,?)";
        for(CityUrl4LianJia culj : list){
            Object[] obj =new Object[]{culj.getCityTitle(),culj.getCityName(),culj.getCityURL()};
            objs.add(obj);
        }
        jdbcHelper.executeBatch(sql,objs);


    }

    public void insertHouseDetail4LianJia(List<HouseDetail4LianJia> list) {
        List<Object[]> objs = new ArrayList<Object[]>();
        String sql ="insert into house_detail (" +
                "title,url,xiaoqu,shihu,size,direction,style,lift,detail,address,tag,totalPrice,unitPrice" +
                ") values (?,?,?,?,?,?,?,?,?,?,?,?,?)";

        for(HouseDetail4LianJia hdlj : list){
            Object[] obj =new Object[]{
                    hdlj.getTitle(),hdlj.getUrl(),hdlj.getXiaoqu(),hdlj.getShihu(),hdlj.getSize(),hdlj.getDirection(),
                    hdlj.getStyle(), hdlj.getLift(),hdlj.getDetail(), hdlj.getAddress(),hdlj.getTag(),hdlj.getTotalPrice(),hdlj.getUnitPrice()};
            objs.add(obj);
        }
        jdbcHelper.executeBatch(sql,objs);

    }


    public static void main(String[] args){
        try {
            String[] citys =new String[]{"tj"};
            // "sh","hz","cd","qd","bj"

            for(String str : citys) {


                for (int i = 1; i <= 100; i++) {
                    StringBuilder url = new StringBuilder("https://"+str+".lianjia.com/ershoufang/");
                    if (i != 1) {
                        url.append("/pg").append(i);
                    }

                    Document d = JsoupUtil.getHTMLTextByUrl(url.toString());
                    LianJiaDao lianJiaDao = new LianJiaDaoImpl();
                    //            List<CityUrl4LianJia> list = HouseOfLianJia.getCityUrl4LianJia(d);

                    //            lianJiaDao.insertCityUrl4LianJia(list);
                    List<HouseDetail4LianJia> list = HouseOfLianJia.getHouseDetail4LianJia(d);

                    lianJiaDao.insertHouseDetail4LianJia(list);

                    Thread.sleep(2000);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
