package com.zhanghao.dao;

import com.zhanghao.domain.CityUrl4LianJia;
import com.zhanghao.domain.HouseDetail4LianJia;
import com.zhanghao.domain.SchoolGaoKao;
import com.zhanghao.domain.SchoolListJsonItem;

import java.util.List;

/**
 * Created by Administrator on 2018/8/16/016.
 */
public interface SchoolDao {

    void insertSchoolGaoKao(List<SchoolGaoKao> list);
    void insertSchoolDetail(List<SchoolListJsonItem> list);

}
