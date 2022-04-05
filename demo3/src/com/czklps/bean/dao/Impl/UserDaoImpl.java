package com.czklps.bean.dao.Impl;

import com.czklps.bean.dao.UserDao;
import org.springframework.stereotype.Repository;

//如果不输入值那么默认会是 类名首字母小写
@Repository(value = "userDaoImpl")
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("userdao add......");
    }
}
