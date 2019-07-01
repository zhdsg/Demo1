package com.zhanghao.domain;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2019/6/30/030.
 */
public class SchoolListJsonItem {
    private String address;
    private int admissions;
    private  String[] all;
    private String belong;
    private int central;
    private int city_id;
    private String city_name;
    private int code_enroll;
    private int county_id;
    private String county_name;
    private String data_code;
    private int department;
    private int dual_class;
    private String dual_class_name;
    private int f211;
    private int f985;
    private String  id ;
    private int is_recruitment;
    private int is_top;
    private  String[] keywords;
    private int level;
    private String level_name;
    private String name ;
    private int province_id;
    private String  province_name;
    private int rank;
    private int rank_type;
    private int school_id;
    private int school_type;
    private List<SchoolSpecialDetail> special;
    private int type;
    private String type_name;
    private int view_month;
    private String view_total;
    private Long _version_;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAdmissions() {
        return admissions;
    }

    public void setAdmissions(int admissions) {
        this.admissions = admissions;
    }

    public String[] getAll() {
        return all;
    }

    public void setAll(String[] all) {
        this.all = all;
    }

    public String getBelong() {
        return belong;
    }

    public void setBelong(String belong) {
        this.belong = belong;
    }

    public int getCentral() {
        return central;
    }

    public void setCentral(int central) {
        this.central = central;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public int getCode_enroll() {
        return code_enroll;
    }

    public void setCode_enroll(int code_enroll) {
        this.code_enroll = code_enroll;
    }

    public int getCounty_id() {
        return county_id;
    }

    public void setCounty_id(int county_id) {
        this.county_id = county_id;
    }

    public String getCounty_name() {
        return county_name;
    }

    public void setCounty_name(String county_name) {
        this.county_name = county_name;
    }

    public String getData_code() {
        return data_code;
    }

    public void setData_code(String data_code) {
        this.data_code = data_code;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getDual_class() {
        return dual_class;
    }

    public void setDual_class(int dual_class) {
        this.dual_class = dual_class;
    }

    public String getDual_class_name() {
        return dual_class_name;
    }

    public void setDual_class_name(String dual_class_name) {
        this.dual_class_name = dual_class_name;
    }

    public int getF211() {
        return f211;
    }

    public void setF211(int f211) {
        this.f211 = f211;
    }

    public int getF985() {
        return f985;
    }

    public void setF985(int f985) {
        this.f985 = f985;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getIs_recruitment() {
        return is_recruitment;
    }

    public void setIs_recruitment(int is_recruitment) {
        this.is_recruitment = is_recruitment;
    }

    public int getIs_top() {
        return is_top;
    }

    public void setIs_top(int is_top) {
        this.is_top = is_top;
    }

    public String[] getKeywords() {
        return keywords;
    }

    public void setKeywords(String[] keywords) {
        this.keywords = keywords;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getLevel_name() {
        return level_name;
    }

    public void setLevel_name(String level_name) {
        this.level_name = level_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProvince_id() {
        return province_id;
    }

    public void setProvince_id(int province_id) {
        this.province_id = province_id;
    }

    public String getProvince_name() {
        return province_name;
    }

    public void setProvince_name(String province_name) {
        this.province_name = province_name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getRank_type() {
        return rank_type;
    }

    public void setRank_type(int rank_type) {
        this.rank_type = rank_type;
    }

    public int getSchool_id() {
        return school_id;
    }

    public void setSchool_id(int school_id) {
        this.school_id = school_id;
    }

    public int getSchool_type() {
        return school_type;
    }

    public void setSchool_type(int school_type) {
        this.school_type = school_type;
    }

    public List<SchoolSpecialDetail> getSpecial() {
        return special;
    }

    public void setSpecial(List<SchoolSpecialDetail> special) {
        this.special = special;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public int getView_month() {
        return view_month;
    }

    public void setView_month(int view_month) {
        this.view_month = view_month;
    }

    public String getView_total() {
        return view_total;
    }

    public void setView_total(String view_total) {
        this.view_total = view_total;
    }

    public Long get_version_() {
        return _version_;
    }

    public void set_version_(Long _version_) {
        this._version_ = _version_;
    }

    @Override
    public String toString() {
        return "SchoolListJsonItem{" +
                "address='" + address + '\'' +
                ", admissions=" + admissions +
                ", all=" + Arrays.toString(all) +
                ", belong='" + belong + '\'' +
                ", central=" + central +
                ", city_id=" + city_id +
                ", city_name='" + city_name + '\'' +
                ", code_enroll=" + code_enroll +
                ", county_id=" + county_id +
                ", county_name='" + county_name + '\'' +
                ", data_code='" + data_code + '\'' +
                ", department=" + department +
                ", dual_class=" + dual_class +
                ", dual_class_name='" + dual_class_name + '\'' +
                ", f211=" + f211 +
                ", f985=" + f985 +
                ", id='" + id + '\'' +
                ", is_recruitment=" + is_recruitment +
                ", is_top=" + is_top +
                ", keywords=" + Arrays.toString(keywords) +
                ", level=" + level +
                ", level_name='" + level_name + '\'' +
                ", name='" + name + '\'' +
                ", province_id=" + province_id +
                ", province_name='" + province_name + '\'' +
                ", rank=" + rank +
                ", rank_type=" + rank_type +
                ", school_id=" + school_id +
                ", school_type=" + school_type +
                ", special=" + special +
                ", type=" + type +
                ", type_name='" + type_name + '\'' +
                ", view_month=" + view_month +
                ", view_total='" + view_total + '\'' +
                ", _version_=" + _version_ +
                '}';
    }
}
