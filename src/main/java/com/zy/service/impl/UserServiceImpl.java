package com.zy.service.impl;

import com.zy.entity.User;
import com.zy.mapper.UserMapper;
import com.zy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public User loginUser(String name, String pwd) {
        return userMapper.loginUser(name,pwd);
    }

    @Override
    public int registerUser(User u) {
        return userMapper.insert(u);
    }

}
