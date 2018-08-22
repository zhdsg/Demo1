package com.zhanghao;


import cz.mallat.uasparser.OnlineUpdater;
import cz.mallat.uasparser.UASparser;
import cz.mallat.uasparser.UserAgentInfo;
import org.apache.hadoop.hive.ql.exec.UDF;

import java.io.IOException;

/**
 * Created by Administrator on 2018/8/13/013.
 */
public class HiveUDF extends  UDF {
    static UASparser uaSparser= null ;
    static {

        try {
             uaSparser = new UASparser(OnlineUpdater.getVendoredInputStream());
            System.out.println("-----------------------------------------------------------------------------------------------------------");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String evaluate(String u_a){
        String result =null ;
        try {

            if(u_a !=null && !u_a.trim().isEmpty()){
                result = uaSparser.parse(u_a).getUaFamily();
                System.out.println("========================================================================");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;

    }
    public static void  main(String[] arg){
        String str="Mozilla/5.0 (iPhone; CPU iPhone OS 11_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E216 MicroMessenger/6.6.6 NetType/4G Language/zh_CN";
        HiveUDF hive = new HiveUDF();
        System.out.println(hive.evaluate(str));

    }

}
