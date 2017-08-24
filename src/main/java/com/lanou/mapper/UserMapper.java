package com.lanou.mapper;


import com.lanou.bean.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User selectNameAndPassword(@Param("name") String name, @Param("password")String password);

    Integer insertUser(User user);

    User selectUserById(@Param("userId")Integer userId);

    //    注册的判断用户名是否已经有了 登录-通过名字查到这个人
    User findUserByName(String name);
}
