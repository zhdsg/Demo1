package com.zhanghao.domain;

/**
 * Created by Administrator on 2018/8/16/016.
 */
public class HouseDetail4LianJia {
    private String title ;
    private String url;
    private String  xiaoqu;
    private String  shihu;
    private double  size;
    private String direction;
    private String style;
    private String  lift;
    private String detail;
    private String  address;
    private String tag;
    private double totalPrice;
    private double unitPrice;

    public HouseDetail4LianJia(String title, String url, String xiaoqu, String shihu,
                               double size, String direction, String style, String lift,
                               String detail, String address, String tag, double totalPrice, double unitPrice) {
        this.title = title;
        this.url = url;
        this.xiaoqu = xiaoqu;
        this.shihu = shihu;
        this.size = size;
        this.direction = direction;
        this.style = style;
        this.lift = lift;
        this.detail = detail;
        this.address = address;
        this.tag = tag;
        this.totalPrice = totalPrice;
        this.unitPrice = unitPrice;
    }
    public HouseDetail4LianJia(){}
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getXiaoqu() {
        return xiaoqu;
    }

    public void setXiaoqu(String xiaoqu) {
        this.xiaoqu = xiaoqu;
    }

    public String getShihu() {
        return shihu;
    }

    public void setShihu(String shihu) {
        this.shihu = shihu;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getLift() {
        return lift;
    }

    public void setLift(String lift) {
        this.lift = lift;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "HouseDetail4LianJia{" +
                "title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", xiaoqu='" + xiaoqu + '\'' +
                ", shihu='" + shihu + '\'' +
                ", size=" + size +
                ", direction='" + direction + '\'' +
                ", style='" + style + '\'' +
                ", lift='" + lift + '\'' +
                ", detail='" + detail + '\'' +
                ", address='" + address + '\'' +
                ", tag='" + tag + '\'' +
                ", totalPrice=" + totalPrice +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
