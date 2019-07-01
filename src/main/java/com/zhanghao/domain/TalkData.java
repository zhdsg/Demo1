package com.zhanghao.domain;

/**
 * Created by Administrator on 2018/9/19/019.
 */
public class TalkData {
    private String mobile;
    private String json;

    public TalkData(String mobile, String json) {
        this.mobile = mobile;
        this.json = json;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }

    @Override
    public String toString() {
        return "TalkData{" +
                "mobile='" + mobile + '\'' +
                ", json='" + json + '\'' +
                '}';
    }
}
