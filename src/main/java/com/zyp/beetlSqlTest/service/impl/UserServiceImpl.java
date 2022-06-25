package com.zyp.beetlSqlTest.service.impl;

import com.zyp.beetlSqlTest.entity.User;
import com.zyp.beetlSqlTest.dao.UserDao;
import com.zyp.beetlSqlTest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public List<User> queryAll() {
        return userDao.selectAll();
    }

    @Override
    public User queryById(int id) {
        return userDao.unique(id);
    }
}
