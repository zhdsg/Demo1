package com.zhanghao.domain;

import java.util.List;

/**
 * Created by Administrator on 2019/6/30/030.
 */
public class SchoolJsonData {
    private int numFound;
    private List<SchoolGaoKao> item;

    public int getNumFound() {
        return numFound;
    }

    public void setNumFound(int numFound) {
        this.numFound = numFound;
    }

    public List<SchoolGaoKao> getItem() {
        return item;
    }

    public void setItem(List<SchoolGaoKao> item) {
        this.item = item;
    }
}
