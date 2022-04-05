package com.czklps.bean.service.Impl;

import com.czklps.bean.dao.UserDao;
import com.czklps.bean.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Value(value = "boboge")
    private String name;

    @Autowired
    @Qualifier(value = "userDaoImpl")
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println(name);
        userDao.add();
    }
}
