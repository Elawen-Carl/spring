package com.czklps.bean.Test;

import com.czklps.bean.Admin;
import com.czklps.bean.User;
import com.czklps.bean.service.Impl.UserServiceImpl;
import com.czklps.bean.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    /**
     * 返回一个 ApplicationContext 对象
     */
    public ApplicationContext getContext(String configPath) {
        return new ClassPathXmlApplicationContext(configPath);
    }

    /**
     * 测试 spring ioc 实例一个user对象
     */
    @Test
    public void testCretUser() {
        ApplicationContext context = getContext("bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

    /**
     * 使用 xml 构造函数注入属性
     */
    @Test
    public void testConstr() {
        ApplicationContext context = this.getContext("bean1.xml");
        User user = context.getBean("user2", User.class);
        System.out.println(user);
    }

    /**
     * 使用 property 完成注入属性
     */
    @Test
    public void testProperty() {
        ApplicationContext context = this.getContext("bean1.xml");
        User user = context.getBean("user3", User.class);
        System.out.println(user);
    }

    /**
     * 使用 property 完成注入 ref 属性
     */
    @Test
    public void testPropertyObj() {
        ApplicationContext context = this.getContext("bean2.xml");
        UserService userService = context.getBean("userService", UserServiceImpl.class);
        userService.add();
    }

    @Test
    public void testProperty2() {
        ApplicationContext context = this.getContext("bean3.xml");
        Admin admin = context.getBean("admin", Admin.class);
        System.out.println(admin);
    }

    /**
     * p: 标签进行 sql 注入
     */
    @Test
    public void testPtaget() {
        ApplicationContext context = this.getContext("bean1.xml");
        User user = context.getBean("user4", User.class);
        System.out.println(user);
    }

    /**
     * 测试级联赋值
     */
    @Test
    public void testProperty3() {
        ApplicationContext context = this.getContext("bean4.xml");
        Admin admin = context.getBean("admin", Admin.class);
        System.out.println(admin);
    }


}
