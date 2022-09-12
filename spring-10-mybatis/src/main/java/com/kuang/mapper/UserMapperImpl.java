package com.kuang.mapper;

import com.kuang.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author chenpi
 * @create 2022-09-12 16:00
 */
public class UserMapperImpl implements UserMapper {

    //我们的所有操作，在原来都是以sqlSession来执行
    //现在都是以SqlSessionTemplate

    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> getUsers() {

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        return mapper.getUsers();
    }
}
