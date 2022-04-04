package com.czklps.bean;

public class User {
    private String name;
    private String address;

    public User(String name) {
        this.name = name;
    }

    public User() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void add(){
        System.out.println("添加中...");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
