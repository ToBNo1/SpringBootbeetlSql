package com.zyp.beetlSqlTest.service;

import com.zyp.beetlSqlTest.entity.User;

import java.util.List;

public interface UserService {
    List<User> queryAll();
    User queryById(int id);
}
