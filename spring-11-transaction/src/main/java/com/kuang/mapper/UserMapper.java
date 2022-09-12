package com.kuang.mapper;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author chenpi
 * @create 2022-09-08 22:35
 */
public interface UserMapper {
    List<User> getUsers();

    //增加一个用户
    int addUser(User user);

    //删除一个用户
    int delUserById(@Param("id") int id);


}
