package com.zhanghao.program1;




import com.alibaba.fastjson.JSON;
import com.zhanghao.dao.SchoolDao;
import com.zhanghao.dao.impl.SchoolDaoImpl;
import com.zhanghao.domain.SchoolGaoKao;
import com.zhanghao.domain.SchoolJsonObjk;
import com.zhanghao.domain.SchoolListJson;
import com.zhanghao.domain.SchoolListJsonItem;
import com.zhanghao.uitls.JsoupUtil;
import com.zhanghao.uitls.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/8/16/016.
 */
public class SchoolSpecial {


    private int numFound_gaokao;
    private int numFound_list;

    public int getNumFound_gaokao() {
        return numFound_gaokao;
    }

    public void setNumFound_gaokao(int numFound_gaokao) {
        this.numFound_gaokao = numFound_gaokao;
    }

    public int getNumFound_list() {
        return numFound_list;
    }

    public void setNumFound_list(int numFound_list) {
        this.numFound_list = numFound_list;
    }

    public   List<SchoolGaoKao> getSchoolGaoKao(String url ,String year) throws Exception {
        List<SchoolGaoKao> list = new ArrayList<SchoolGaoKao>();

        SchoolJsonObjk jsona =null;
            URL restURL = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) restURL.openConnection();
            conn.setRequestMethod("GET");
            //设置是否从httpUrlConnection读入，默认情况下是true; httpUrlConnection.setDoInput(true);
            conn.setDoOutput(true);
            conn.setRequestProperty("accept", "application/json, text/plain, */*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.169 Safari/537.36");


//            PrintWriter out= new PrintWriter(conn.getOutputStream());
//            //缓冲数据
//            out.flush();
            if(conn.getResponseCode()==200){

                //获取URLConnection对象对应的输入流
                InputStream is = conn.getInputStream();
                //构造一个字符流缓存
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                String str = "";
                while ((str = br.readLine()) != null) {
                     jsona = JSON.parseObject(str, SchoolJsonObjk.class);

                }
                //关闭流
                is.close();

                for(SchoolGaoKao a :jsona.getData().getItem()){
                    a.setYear(Integer.parseInt(year));
                    list.add(a);
                }

                numFound_gaokao=jsona.getData().getNumFound();
            }

            //断开连接，最好写上，disconnect是在底层tcp socket链接空闲时才切断。如果正在被其他线程使用就不切断。
            //固定多线程的话，如果不disconnect，链接会增多，直到收发不出信息。写上disconnect后正常一些。
            conn.disconnect();
//            System.out.println("完整结束");

        return list ;
    }

    public  List<SchoolListJsonItem> getScchoolList(String url )throws Exception {
        List<SchoolListJsonItem> list = new ArrayList<SchoolListJsonItem>();

        SchoolListJson jsona =null;

        URL restURL = new URL(url);
        HttpURLConnection conn = (HttpURLConnection) restURL.openConnection();
        conn.setRequestMethod("POST");
        //设置是否从httpUrlConnection读入，默认情况下是true; httpUrlConnection.setDoInput(true);
        conn.setDoOutput(true);
        conn.setRequestProperty("accept", "application/json, text/plain, */*");
//        conn.setRequestProperty("connection", "Keep-Alive");
        conn.setRequestProperty("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.169 Safari/537.36");
        conn.setRequestProperty("Content-Type","application/json;charset=UTF-8");

//            PrintWriter out= new PrintWriter(conn.getOutputStream());
//            //缓冲数据
//            out.flush();
        if(conn.getResponseCode()==200){

            //获取URLConnection对象对应的输入流
            InputStream is = conn.getInputStream();
            //构造一个字符流缓存
            BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
            String str = "";
            while ((str = br.readLine()) != null) {
                jsona=JSON.parseObject(str, SchoolListJson.class);

            }
            //关闭流
            is.close();
            numFound_list=jsona.getData().getNumFound();
        }


        //断开连接，最好写上，disconnect是在底层tcp socket链接空闲时才切断。如果正在被其他线程使用就不切断。
        //固定多线程的话，如果不disconnect，链接会增多，直到收发不出信息。写上disconnect后正常一些。
        conn.disconnect();
//        System.out.println("完整结束");
        for(SchoolListJsonItem a :jsona.getData().getItem()){
            list.add(a);
        }


        return list;
    }

    public static void main(String[] args){
        try {

            int flag = 1;
            int[] year =new int[]{2017,2018};

            String school =null;
            for (int y : year){

                while (flag!=0) {


                    String url = "https://static-data.eol.cn/www/2.0/schoolspecialindex/" + y + "/"+school+ "/37/1/"+flag+".json";
                    SchoolSpecial ss = new SchoolSpecial();
                    List<SchoolGaoKao> list = ss.getSchoolGaoKao(url, String.valueOf(y));

                    SchoolDao dao = new SchoolDaoImpl();
                    dao.insertSchoolGaoKao(list);
                    int page  = (int) Math.floor(ss.getNumFound_gaokao() / 20);

                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }



}
