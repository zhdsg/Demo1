package com.zhanghao.uitls;

import org.apache.http.HttpClientConnection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import sun.net.www.http.HttpClient;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Administrator on 2018/10/31/031.
 */
public class HttpClientUtils {

    public static String getHTML(String url) throws IOException {

        Document comment =Jsoup.connect("url").get();

        return null;
    }
}
