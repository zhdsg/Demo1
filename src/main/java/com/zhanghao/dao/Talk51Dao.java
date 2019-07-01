package com.zhanghao.dao;

import com.zhanghao.domain.TalkData;

import java.util.List;

/**
 * Created by Administrator on 2018/9/19/019.
 */
public interface Talk51Dao {
    void insertMoblie(List<TalkData> list);
    void insert(TalkData data);
    //void insertHouseDetail4LianJia(List<String> list);
}
