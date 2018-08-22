package com.zhanghao.test;

import com.zhanghao.jdbc.JDBCHelper;

/**
 * Created by Administrator on 2018/8/16/016.
 */
public class Test {
    public static void main(String[] args){


        JDBCHelper jdbcHelper = JDBCHelper.getInstance();


        for (int i =0;i<100 ;i++){

           myThread a =new myThread(jdbcHelper);
                   a.start();


        }



    }


}
class myThread extends Thread{
    private  JDBCHelper jdbcHelper;
    public myThread( JDBCHelper jdbcHelper){
        this.jdbcHelper=jdbcHelper;
    }
    @Override
    public void run() {

        jdbcHelper.executeUpdate("insert into user (name,age) values('aa',11)",new Object[]{});

    }

}
