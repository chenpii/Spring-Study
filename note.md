## 常用依赖
    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.11</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.2.0.RELEASE</version>
        </dependency>
    </dependencies>

## 注解说明

- @Autowired 先bytype再byname；如果不能唯一装配，使用@Qualifier(value = "xxx") 搭配使用
- @Nullable 字段标记了这个注解，说明这个字段可以为null
- @Resource 先byname再bytype



- @Component 组件。放在类上，说明这个类北Spring管理了，就是bean！
- @Repository
- @Service
- @Controller