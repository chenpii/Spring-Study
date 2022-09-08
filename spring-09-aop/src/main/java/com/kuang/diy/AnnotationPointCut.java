package com.kuang.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 使用注解方式实现AOP
 *
 * @author chenpi
 * @create 2022-09-08 22:00
 */
@Aspect//标注这个类是一个切面
public class AnnotationPointCut {

    @Before("execution(* com.kuang.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("=========方法执行前=========");
    }

    @After("execution(* com.kuang.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("=========方法执行后=========");
    }

    //在环绕增强中，我们可以给定一个参数，代表我们要获取切入的点
    @Around("execution(* com.kuang.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");

        Signature signature = joinPoint.getSignature();//获得签名
        System.out.println("signature" + signature);


        Object proceed = joinPoint.proceed(); //执行方法

        System.out.println("环绕后");
    }
}
