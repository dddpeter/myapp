package com.dddpeter.myapp.user.service;

import com.dddpeter.myapp.user.bo.User;
import com.dddpeter.myapp.user.po.UserEntity;

/**
 * Created by lijinde on 2016-4-29.
 */
public interface UserService {
    User register(User user);
    void update(User user);
    void login(User user);
    void logout(User user);
}
