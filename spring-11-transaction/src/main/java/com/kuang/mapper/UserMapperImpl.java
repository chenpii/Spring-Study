package com.kuang.mapper;

import com.kuang.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author chenpi
 * @create 2022-09-12 16:59
 */
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> getUsers() {
        addUser(new User(5, "里一封", "111111"));
        delUserById(4);
        return getSqlSession().getMapper(UserMapper.class).getUsers();
    }

    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int delUserById(int id) {
        return getSqlSession().getMapper(UserMapper.class).delUserById(id);
    }
}
