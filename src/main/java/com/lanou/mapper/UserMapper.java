package com.lanou.mapper;


import com.lanou.bean.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User selectNameAndPassword(@Param("name") String name, @Param("password")String password);

    Integer insertUser(User user);

    User selectUserById(@Param("userId")Integer userId);

}
