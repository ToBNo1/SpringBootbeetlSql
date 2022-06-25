package com.zyp.beetlSqlTest.controller;

import com.zyp.beetlSqlTest.entity.User;
import com.zyp.beetlSqlTest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/getAll")
    @ResponseBody
    public List<User> listAllUser(){
        return userService.queryAll();
    }

    @GetMapping(value = "/getById/{id}")
    @ResponseBody
    public User getUserById(@PathVariable int id){
        return userService.queryById(id);
    }
}
