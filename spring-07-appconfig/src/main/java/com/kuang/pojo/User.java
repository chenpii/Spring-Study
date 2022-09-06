package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author chenpi
 * @create 2022-09-06 21:43
 */
//这个注解的意思，就是说这个类被Spring接管了，注册到容器中
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }

    @Value("kuang")//属性注入值
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
