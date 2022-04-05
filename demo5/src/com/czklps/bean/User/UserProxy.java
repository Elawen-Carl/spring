package com.czklps.bean.User;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class UserProxy {
    @Pointcut(value = "execution(* com.czklps.bean.User.User.add(..))")
    public void pointcut(){

    }

    //前置通知
    //@Before注解表示作为前置通知
    @Before(value = "pointcut()")
    public void before(){
        System.out.println("before ......");
    }
    //相同切入点抽取

    //最终通知
    @After(value = "execution(* com.czklps.bean.User.User.add(..))")
    public void after(){
        System.out.println("after ...... ");
    }

    //后置通知（返回通知）
    @AfterReturning(value = "execution(* com.czklps.bean.User.User.add(..))")
    public void afterReturning(){
        System.out.println("afterReturning ...... ");
    }

    //异常通知
    @AfterThrowing(value = "execution(* com.czklps.bean.User.User.add(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing.......");
    }

    //环绕通知
    @Around(value = "execution(* com.czklps.bean.User.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around before ...");

        proceedingJoinPoint.proceed();

        System.out.println("around after ...");
    }
}
