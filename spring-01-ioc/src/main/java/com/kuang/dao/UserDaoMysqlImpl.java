package com.kuang.dao;

/**
 * @author chenpi
 * @create 2022-09-04 20:32
 */
public class UserDaoMysqlImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("Mysql获取用户数据！");
    }
}
