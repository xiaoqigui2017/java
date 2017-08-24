package com.lanou.service.impl;


import com.lanou.bean.User;
import com.lanou.mapper.UserMapper;

import com.lanou.service.UserService;
import com.lanou.utils.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper mapper;

//  登录判断
    public User login(String name, String passwrod) {
        User userByName = mapper.findUserByName(name);
        //判断是否查到了这个人
        if (userByName == null) {
            return null;
        }
        if (!passwrod.equals(userByName.getPassword())){
            return null;
        }
        return userByName;
    }

    public Integer register(User user,String passwordAgain) {
        User userByName = mapper.findUserByName(user.getName());
        if (userByName!=null){
            return 0;
        }
        String password = user.getPassword();
        if (!password.equals(passwordAgain)){
            return 0;
        }
        String md5Value = StringUtils.getMD5Value(password);
        user.setPassword(md5Value);
        return mapper.insertUser(user);
    }




}
