package com.czklps.bean;

import com.czklps.bean.service.Impl.UserServiceImpl;
import com.czklps.bean.service.UserService;
import com.czklps.bean.springconfig.SpringConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotaion {
    @Test
    public void testAnnotaion(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userServiceImpl", UserServiceImpl.class);
        userService.add();
    }

    @Test
    public void testXml(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserService userservice = context.getBean("userServiceImpl", UserServiceImpl.class);
        userservice.add();
    }
}
