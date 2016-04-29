package com.dddpeter.myapp.user.dao.impl;


import com.dddpeter.myapp.common.dao.hibernate.BaseDAOHibernate;
import com.dddpeter.myapp.user.dao.UserDao;
import com.dddpeter.myapp.user.po.UserEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by lijinde on 2016-4-29.
 */

@Repository("userDao")
public class UserDaoImpl extends BaseDAOHibernate<UserEntity> implements UserDao {

}
