package com.zhanghao.dao;

import com.zhanghao.domain.CityUrl4LianJia;
import com.zhanghao.domain.HouseDetail4LianJia;

import java.util.List;

/**
 * Created by Administrator on 2018/8/16/016.
 */
public interface LianJiaDao {

    void insertCityUrl4LianJia(List<CityUrl4LianJia> list);
    void insertHouseDetail4LianJia(List<HouseDetail4LianJia> list);

}
