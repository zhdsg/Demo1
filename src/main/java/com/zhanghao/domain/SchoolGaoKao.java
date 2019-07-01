package com.zhanghao.domain;

/**
 * Created by Administrator on 2019/6/30/030.
 */
public class SchoolGaoKao {
    private double average = 0.0;
    private int batch;
    private int year;
    private int level1;
    private String level1_name;
    private int level2;
    private String level2_name;
    private int level3;
    private String level3_name;
    private String local_batch_name;
    private double max;
    private double min;
    private int min_section;
    private int province;
    private String remark;
    private int school_id;
    private int special_id;
    private int spid;
    private String spname;
    private int type;

    public SchoolGaoKao(){}
    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLevel1() {
        return level1;
    }

    public void setLevel1(int level1) {
        this.level1 = level1;
    }

    public String getLevel1_name() {
        return level1_name;
    }

    public void setLevel1_name(String level1_name) {
        this.level1_name = level1_name;
    }

    public int getLevel2() {
        return level2;
    }

    public void setLevel2(int level2) {
        this.level2 = level2;
    }

    public String getLevel2_name() {
        return level2_name;
    }

    public void setLevel2_name(String level2_name) {
        this.level2_name = level2_name;
    }

    public int getLevel3() {
        return level3;
    }

    public void setLevel3(int level3) {
        this.level3 = level3;
    }

    public String getLevel3_name() {
        return level3_name;
    }

    public void setLevel3_name(String level3_name) {
        this.level3_name = level3_name;
    }

    public String getLocal_batch_name() {
        return local_batch_name;
    }

    public void setLocal_batch_name(String local_batch_name) {
        this.local_batch_name = local_batch_name;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public int getMin_section() {
        return min_section;
    }

    public void setMin_section(int min_section) {
        this.min_section = min_section;
    }

    public int getProvince() {
        return province;
    }

    public void setProvince(int province) {
        this.province = province;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getSchool_id() {
        return school_id;
    }

    public void setSchool_id(int school_id) {
        this.school_id = school_id;
    }

    public int getSpecial_id() {
        return special_id;
    }

    public void setSpecial_id(int special_id) {
        this.special_id = special_id;
    }

    public int getSpid() {
        return spid;
    }

    public void setSpid(int spid) {
        this.spid = spid;
    }

    public String getSpname() {
        return spname;
    }

    public void setSpname(String spname) {
        this.spname = spname;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SchoolGaoKao{" +
                "average=" + average +
                ", batch=" + batch +
                ", year=" + year +
                ", level1=" + level1 +
                ", level1_name='" + level1_name + '\'' +
                ", level2=" + level2 +
                ", level2_name='" + level2_name + '\'' +
                ", level3=" + level3 +
                ", level3_name='" + level3_name + '\'' +
                ", local_batch_name='" + local_batch_name + '\'' +
                ", max=" + max +
                ", min=" + min +
                ", min_section=" + min_section +
                ", province=" + province +
                ", remark='" + remark + '\'' +
                ", school_id=" + school_id +
                ", special_id=" + special_id +
                ", spid=" + spid +
                ", spname='" + spname + '\'' +
                ", type=" + type +
                '}';
    }
}
