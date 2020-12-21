package com.ljy.service.impl;

import com.ljy.dao.User.UserMapper;
import com.ljy.model.User;
import com.ljy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public User getOneUserInfo(int id){
        return userMapper.getOneUserInfo(id);
    }

    @Override
    public List<User> getUserForName(String name) {
        return userMapper.getUserForName(name);
    }
}
