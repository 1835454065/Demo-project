package com.wll.entity;

import org.springframework.stereotype.Component;

@Component
public class User {
    int uid;
    String uname;
    String address;

    public User() {
    }

    public User(int uid, String uname, String address) {
        this.uid = uid;
        this.uname = uname;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return uname;
    }

    public void setName(String uname) {
        this.uname = uname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
