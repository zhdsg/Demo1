package com.zhanghao.program1;

import com.zhanghao.uitls.JsoupUtil;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * Created by Administrator on 2018/8/22/022.
 */
public class WeiboProgram {





        public static void main(String[] args){

            try {
                Document e = JsoupUtil.getHTMLTextByUrl("http://s.weibo.com/user/sss&gender=women&age=22y&region=custom:44:6&auth=ord");
                System.out.println(e);

            } catch (IOException e) {
                e.printStackTrace();
            }


        }
}
