package com.kuang.demo01;

/**
 * @author chenpi
 * @create 2022-09-06 22:24
 */
//房东
public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("房东要出租房子");
    }
}
