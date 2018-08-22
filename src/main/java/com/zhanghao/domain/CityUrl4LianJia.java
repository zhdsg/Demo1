package com.zhanghao.domain;

/**
 * Created by Administrator on 2018/8/16/016.
 */
public class CityUrl4LianJia {

//    private String cityCode;
    private String cityTitle;
    private String cityName;
    private String cityURL;

    public CityUrl4LianJia( String cityTitle, String cityName, String cityURL) {
        //this.cityCode = cityCode;
        this.cityTitle = cityTitle;
        this.cityName = cityName;
        this.cityURL = cityURL;
    }
    public CityUrl4LianJia(){}

    public String getCityURL() {
        return cityURL;
    }

    public void setCityURL(String cityURL) {
        this.cityURL = cityURL;
    }

//    public String getCityCode() {
//        return cityCode;
//    }
//
//    public void setCityCode(String cityCode) {
//        this.cityCode = cityCode;
//    }

    public String getCityTitle() {
        return cityTitle;
    }

    public void setCityTitle(String cityTitle) {
        this.cityTitle = cityTitle;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
