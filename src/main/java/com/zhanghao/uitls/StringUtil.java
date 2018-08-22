package com.zhanghao.uitls;

/**
 * Created by Administrator on 2018/8/16/016.
 */
public class StringUtil {
    public static String  ifNull(String str[] , int size,String rlt){
        if(str.length >= size+1 && str[size] !=null) {
            return str[size].trim();
        }else{
            return rlt;
        }
    }
}
