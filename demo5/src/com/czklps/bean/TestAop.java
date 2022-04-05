package com.czklps.bean;

import com.czklps.bean.User.User;
import com.czklps.bean.XMLConfig.Book;
import com.czklps.bean.springconfig.SpringConfigAop;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    @Test
    public void testAop(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

    @Test
    public void testAopXMlConfig(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book", Book.class);
        book.add();
    }

    @Test
    public void testAnnotion(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigAop.class);
        User user = context.getBean("user", User.class);
        user.add();
    }
}
