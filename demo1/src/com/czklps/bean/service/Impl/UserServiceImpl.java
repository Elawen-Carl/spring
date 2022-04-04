package com.czklps.bean.service.Impl;

import com.czklps.bean.dao.UserDao;
import com.czklps.bean.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        System.out.println("Service add ....");
        userDao.add();
    }

}
