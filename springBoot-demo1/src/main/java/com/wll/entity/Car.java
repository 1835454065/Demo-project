package com.wll.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Car {
    private int id;
    private String name;
    private float price;
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd hh:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date createDate;
    // 忽略字段
    //@JsonIgnore
    private String memo;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String isnull;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getIsnull() {
        return isnull;
    }

    public void setIsnull(String isnull) {
        this.isnull = isnull;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", createDate=" + createDate +
                ", memo='" + memo + '\'' +
                ", isnull='" + isnull + '\'' +
                '}';
    }

    public Car(int id, String name, float price, Date createDate, String memo, String isnull) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.createDate = createDate;
        this.memo = memo;
        this.isnull = isnull;
    }

    public Car() {
    }
}
