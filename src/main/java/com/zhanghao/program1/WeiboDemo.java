package com.zhanghao.program1;

import com.zhanghao.uitls.HttpClientUtils;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/10/31/031.
 */
public class WeiboDemo {

    public static void main(String[] args){

        String url = "http://login.sina.com.cn/sso/login.php?client=ssologin.js(v1.4.19)";

        Connection conn =  Jsoup.connect(url);




    }
    public static String prelogin() throws Exception {
        String url = "http://login.sina.com.cn/sso/prelogin.php?entry=weibo&callback=sinaSSOController.preloginCallBack&su=&rsakt=mod&client=ssologin.js(v1.4.18)&_=1446099453139";
        String content = HttpClientUtils.getHTML(url);

        if(null != content && !content.equals("")) {
            content = content.replaceAll("sinaSSOController.preloginCallBack\\((.*)\\)", "$1");
        }
        //System.out.println(content);
        return content;
    }

    public static String load (String url , String method , String params,String cookie) throws IOException {

        URL urlRef =new URL(url);
        HttpURLConnection conn = (HttpURLConnection) urlRef.openConnection();
        conn.setRequestMethod(method);

        conn.setUseCaches(false);
        conn.setRequestProperty("Content-type", "application/json;charset=UTF-8");
        conn.setRequestProperty("accept", "*/*");

        conn.setRequestProperty("connection", "Keep-Alive");
        conn.setRequestProperty("user-agent",
                "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/49.0.2623.112 Safari/537.36");

        conn.setRequestProperty("cookie",cookie);
        // 发送POST请求必须设置如下两行
        conn.setDoOutput(true);
        conn.setDoInput(true);



        PrintWriter out = new PrintWriter(conn.getOutputStream());
        out.print(params);
        out.flush();

        Map<String,List<String>> map = conn.getHeaderFields();
        for(String str : map.keySet()){

            System.out.println(str);
            System.out.println(map.get(str));
            System.out.println("====================");

        }

//        BufferedReader br =new BufferedReader(new InputStreamReader(conn.getInputStream()));
//        String line ="";
//        StringBuilder result =new StringBuilder("");
//               while((line=br.readLine())!=null){
//            result.append(line);
//        }

//        return result.toString();
return null;

    }

}
