package com.lanou.service;


import com.lanou.bean.User;

public interface UserService {


    User login(String name, String password);

    Integer register(User user);





}
