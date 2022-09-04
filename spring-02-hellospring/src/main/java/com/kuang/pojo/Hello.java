package com.kuang.pojo;

/**
 * @author chenpi
 * @create 2022-09-04 21:32
 */
public class Hello {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void show() {
        System.out.println("Hello" + str);
    }
}
