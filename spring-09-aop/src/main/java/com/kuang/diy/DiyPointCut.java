package com.kuang.diy;

/**
 * 自定义切入点类
 *
 * @author chenpi
 * @create 2022-09-08 21:36
 */
public class DiyPointCut {

    public void before() {
        System.out.println("=========方法执行前=========");
    }

    public void after() {
        System.out.println("=========方法执行后=========");
    }


}
