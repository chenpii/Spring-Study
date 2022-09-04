package com.kuang.dao;

/**
 * dao接口实现类
 *
 * @author chenpi
 * @create 2022-09-04 20:26
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("默认获取用户的数据");
    }
}
