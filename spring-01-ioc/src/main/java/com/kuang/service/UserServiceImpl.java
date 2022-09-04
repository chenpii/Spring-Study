package com.kuang.service;

import com.kuang.dao.UserDao;
import com.kuang.dao.UserDaoImpl;
import com.kuang.dao.UserDaoOracleImpl;

/**
 * 业务实现类
 *
 * @author chenpi
 * @create 2022-09-04 20:27
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    //利用set进行动态实现值的注入！
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
