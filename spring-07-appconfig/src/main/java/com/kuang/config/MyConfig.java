package com.kuang.config;

import com.kuang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author chenpi
 * @create 2022-09-06 21:44
 */
//@Configuration 这个也会被Spring容器托管，注册到容器中，因为它本来就是一个@Component
//@Configuration 代表这是一个配置类，就和之前使用的beans.xml一样
@Configuration
@ComponentScan("com.kuang.pojo")
@Import(MyConfig2.class)
public class MyConfig {

    //@Bean 注册一个bean，就相当于我们之前写的一个bean标签
    //方法名：相当于bean标签中的 id
    //返回值：相当于bean标签中的 class
    @Bean
    public User getUser() {
        return new User();//就是返回要注入到bean的对象！
    }
}
