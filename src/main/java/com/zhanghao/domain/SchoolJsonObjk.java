package com.zhanghao.domain;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * Created by Administrator on 2019/6/30/030.
 */
public class SchoolJsonObjk {
    private String code;
    private String message;
    private SchoolJsonData data;
    private String md5;

    public SchoolJsonObjk(String code, String message, SchoolJsonData data, String md5) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.md5 = md5;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SchoolJsonData getData() {
        return data;
    }

    public void setData(SchoolJsonData data) {
        this.data = data;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }
    public static void main(String[] args){


        System.out.println(Math.ceil(1/20));


    }
}
