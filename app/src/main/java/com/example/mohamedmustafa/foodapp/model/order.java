package com.example.mohamedmustafa.foodapp.model;

public class order {
    int img;
    String orderTitle;
    String orderDesc;
    String orderRate;
    String orderPrice;
    int descount;

    public order(int img, String orderTitle, String orderDesc, String orderRate, String orderPrice, int descount) {
        this.img = img;
        this.orderTitle = orderTitle;
        this.orderDesc = orderDesc;
        this.orderRate = orderRate;
        this.orderPrice = orderPrice;
        this.descount = descount;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getOrderTitle() {
        return orderTitle;
    }

    public void setOrderTitle(String orderTitle) {
        this.orderTitle = orderTitle;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    public String getOrderRate() {
        return orderRate;
    }

    public void setOrderRate(String orderRate) {
        this.orderRate = orderRate;
    }

    public String getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice;
    }

    public int getDescount() {
        return descount;
    }

    public void setDescount(int descount) {
        this.descount = descount;
    }
}
