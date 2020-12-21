package com.ljy.service;

import com.ljy.model.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User getOneUserInfo(int id);
    List<User> getUserForName(String name);
}
