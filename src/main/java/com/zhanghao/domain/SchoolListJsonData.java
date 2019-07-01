package com.zhanghao.domain;

import java.util.List;

/**
 * Created by Administrator on 2019/6/30/030.
 */
public class SchoolListJsonData {
    private int numFound;
    private List<SchoolListJsonItem> item;

    public int getNumFound() {
        return numFound;
    }

    public void setNumFound(int numFound) {
        this.numFound = numFound;
    }

    public List<SchoolListJsonItem> getItem() {
        return item;
    }

    public void setItem(List<SchoolListJsonItem> item) {
        this.item = item;
    }
}
