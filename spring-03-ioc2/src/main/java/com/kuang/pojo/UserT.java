package com.kuang.pojo;

public class UserT {
    private String name;

    public UserT() {
        System.out.println("UserT的无参构造");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name=" + name);
    }
}
