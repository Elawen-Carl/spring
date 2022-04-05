package com.czklps.bean.User;

import org.springframework.stereotype.Component;

@Component
public class User {
    public void add(){
        int i = 10 / 0;
        System.out.println("add .... ");
    }
}
