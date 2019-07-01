package com.zhanghao.dao.impl;

import com.zhanghao.dao.LianJiaDao;
import com.zhanghao.dao.SchoolDao;
import com.zhanghao.domain.CityUrl4LianJia;
import com.zhanghao.domain.HouseDetail4LianJia;
import com.zhanghao.domain.SchoolGaoKao;
import com.zhanghao.jdbc.JDBCHelper;
import com.zhanghao.program1.HouseOfLianJia;
import com.zhanghao.uitls.JsoupUtil;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/8/16/016.
 */
public class SchoolDaoImpl implements SchoolDao {

    JDBCHelper jdbcHelper =JDBCHelper.getInstance();

    public void insertSchoolGaoKao(List<SchoolGaoKao> list) {
        List<Object[]> objs = new ArrayList<Object[]>();
         String sql = "replace into school_gk (`average`,`batch`,`year`,`level1`,`level1_name`,`level2`,`level2_name`,`level3`,`level3_name`,`local_batch_name`,`max`,`min`" +
                 ",`min_section`,`province`,`remark`,`school_id`,`special_id`,`spid`,`spname`,`type`) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        for(SchoolGaoKao gaoKao : list){
            Object[] obj =new Object[]{gaoKao.getAverage(),gaoKao.getBatch(),gaoKao.getYear(),gaoKao.getLevel1(),gaoKao.getLevel1_name()
                    ,gaoKao.getLevel2(), gaoKao.getLevel2_name(),gaoKao.getLevel3(),gaoKao.getLevel3_name(),gaoKao.getLocal_batch_name()
                    ,gaoKao.getMax(),gaoKao.getMin(),gaoKao.getMin_section(),gaoKao.getProvince(),gaoKao.getRemark(),gaoKao.getSchool_id()
                    , gaoKao.getSpecial_id(),gaoKao.getSpid(),gaoKao.getSpname(),gaoKao.getType()
            };
            objs.add(obj);
        }
        jdbcHelper.executeBatch(sql,objs);


    }

    public void insertHouseDetail4LianJia(List<SchoolGaoKao> list) {
//        List<Object[]> objs = new ArrayList<Object[]>();
//        String sql ="insert into house_detail (" +
//                "title,url,xiaoqu,shihu,size,direction,style,lift,detail,address,tag,totalPrice,unitPrice" +
//                ") values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
//
//        for(SchoolGaoKao hdlj : list){
//            Object[] obj =new Object[]{
//                    hdlj.getTitle(),hdlj.getUrl(),hdlj.getXiaoqu(),hdlj.getShihu(),hdlj.getSize(),hdlj.getDirection(),
//                    hdlj.getStyle(), hdlj.getLift(),hdlj.getDetail(), hdlj.getAddress(),hdlj.getTag(),hdlj.getTotalPrice(),hdlj.getUnitPrice()};
//            objs.add(obj);
//        }
//        jdbcHelper.executeBatch(sql,objs);

    }


    public static void main(String[] args){
        try {

            SchoolDao sd = new SchoolDaoImpl();
            List<SchoolGaoKao> list =new ArrayList<SchoolGaoKao>();
            SchoolGaoKao aa =new SchoolGaoKao();
            aa.setAverage(111.00);
            list.add(aa);
           sd.insertSchoolGaoKao(list);


//            for(;;) {
//
//
//
//                    Thread.sleep(2000);
//
//                }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
