package com.zy.service;

import com.zy.entity.User;

public interface UserService {

    User findById(Integer id);

    User loginUser(String name, String pwd);

    int registerUser(User u);

}
