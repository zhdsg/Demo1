package com.zhanghao.program1;




import com.alibaba.fastjson.JSONObject;
import com.zhanghao.dao.Talk51Dao;
import com.zhanghao.dao.impl.Talk51DaoImpl;
import com.zhanghao.domain.TalkData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/9/18/018.
 */
public class Talk51Data {

    public static String load (String url , String method , String params) throws IOException {

        URL urlRef =new URL(url);
        HttpURLConnection conn = (HttpURLConnection) urlRef.openConnection();
        conn.setRequestMethod(method);

        conn.setUseCaches(false);
        conn.setRequestProperty("Content-type", "application/json;charset=UTF-8");
        conn.setRequestProperty("accept", "*/*");

        conn.setRequestProperty("connection", "Keep-Alive");
        conn.setRequestProperty("user-agent",
                "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/49.0.2623.112 Safari/537.36");
        // 发送POST请求必须设置如下两行
        conn.setDoOutput(true);
        conn.setDoInput(true);


        PrintWriter out = new PrintWriter(conn.getOutputStream());
        out.print(params);
        out.flush();
        BufferedReader br =new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line ="";
        StringBuilder result =new StringBuilder("");
        while((line=br.readLine())!=null){
            result.append(line);
        }

        return result.toString();


    }
    public static boolean filter(String str ){

        return false;
    }

    public static void main(String[] args){

        //System.out.println(System.currentTimeMillis());

        //System.out.println(System.currentTimeMillis());
        try {
//            String[] head =new String[]{"139","138","137"
//                    ,"136","135","134","178","170","188","187","183","182","159"
//                    ,"158","157","152","150","147","186","185","170","156","155"
//                    ,"130","131","132","189","","","",""};
            Talk51Dao dao = new Talk51DaoImpl() ;
            //List<String> list = new ArrayList<String>();
            TalkData data = null;
            int flag = 0;
            for(long a = 18918580000L;a<=18918589999L ;a++ ){

                if (flag%2==0){
                    a=18918582560L;
                    System.out.println(flag);
                }
                String param= "mobile="+a+"&client=1";
                String str =load("http://login.51talk.com/ajax/mobile/check", "POST", param);

                //JSONObject obj = JSONObject.parseObject(str);
                //System.out.println("mobile:"+a+"|"+obj.getString("code"));
//                if(str.contains("10000")){
//                    list.add(a+"");
//                }
                data =new TalkData(a+"",str);
                System.out.println(data);
                // dao.insert(data);

                if(flag >2000){
                    flag=0;
                    Thread.sleep(1000*60*60);
                }
                    flag++;
                Thread.sleep(1000);

            }


        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
