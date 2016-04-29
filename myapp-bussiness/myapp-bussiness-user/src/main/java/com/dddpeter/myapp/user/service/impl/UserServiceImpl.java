package com.dddpeter.myapp.user.service.impl;

import com.dddpeter.myapp.user.bo.User;
import com.dddpeter.myapp.user.dao.UserDao;
import com.dddpeter.myapp.user.po.UserEntity;
import com.dddpeter.myapp.user.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by lijinde on 2016-4-29.
 */
@Service("userService")
public class UserServiceImpl implements UserService{
    @Resource
    UserDao userDao;
    @Override

    @Transactional(propagation = Propagation.REQUIRED)
    public User register(User user) {
        UserEntity entity = new UserEntity();
        entity.setUserName(user.getUserName());
        entity.setMobilePhone(user.getMobilePhone());
        entity.setPassword(user.getPassword());
        userDao.save(entity);
        user.setUserId(entity.getUserId());
        return  user;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void login(User user) {

    }

    @Override
    public void logout(User user) {

    }
}
