package com.zhanghao.uitls;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * Created by Administrator on 2018/8/16/016.
 */
public class JsoupUtil {

    public static Document getHTMLTextByUrl(String url ) throws IOException {
        return Jsoup.connect(url).timeout(500000).get();
    }


}
