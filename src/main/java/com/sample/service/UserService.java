package com.sample.service;

import com.sample.web.view.User;

public interface UserService {
    void addUser(User user);
    User loginUser(String id, String password);
    void updateUser(User user);
    User getUserDetail(String id);
}