package com.kuang.mapper;

import com.kuang.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author chenpi
 * @create 2022-09-12 16:29
 */
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> getUsers() {
        return getSqlSession().getMapper(UserMapper.class).getUsers();
    }
}
