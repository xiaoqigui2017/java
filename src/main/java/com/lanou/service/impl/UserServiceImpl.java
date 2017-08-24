package com.lanou.service.impl;


import com.lanou.bean.User;
import com.lanou.mapper.UserMapper;

import com.lanou.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper mapper;


    public User login(String name, String passwrod) {
        return mapper.selectNameAndPassword(name,passwrod);
    }

    public Integer register(User user) {
        return mapper.insertUser(user);
    }




}
