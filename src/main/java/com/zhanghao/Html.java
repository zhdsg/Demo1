package com.zhanghao;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by Administrator on 2018/8/9/009.
 */
public class Html {
    public Document getHtmlTextByUrl(String url ) throws IOException {

        Document doc = Jsoup.connect(url).timeout(5000000).get();

        return doc;
    }

    public static void main(String[] arg){

        String url = "https://qd.lianjia.com/ershoufang/";


       // for(int i =1 ;i<=100;i++){


            try {
                Document doc = Jsoup.connect(url).timeout(5000000).get();
                Elements el =doc.select("li.clear.LOGCLICKDATA");

                for(Element e :el){
                    //±êÌâ
//                    Element title_e =e.select("div.title").first();
//                    String href =title_e.child(0).attr("href");
//                    String titleName =title_e.child(0).ownText();
//                    System.out.println(href);
//                    System.out.println(titleName);
                    //µØÖ·
                    Element houseInfo_e =e.select("div.houseInfo").first();
                    String houseInfo= houseInfo_e.text();
                    System.out.println(houseInfo_e.text());


                }
            } catch (IOException e) {
                e.printStackTrace();
            }

//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//        }

    }



}
