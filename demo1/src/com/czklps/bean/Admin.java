package com.czklps.bean;

import java.util.List;

public class Admin {
    private String name;
    private String address;
    private User user;

    public Admin(String name) {
        this.name = name;
    }

    public Admin() {
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User getUser() {
        return user;
    }

    public void add(){
        System.out.println("添加中...");
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", user=" + user +
                '}';
    }

}
