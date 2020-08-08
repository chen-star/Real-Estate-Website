package com.alex.house.controller;

import com.alex.house.common.model.User;
import com.alex.house.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Alex CHEN
 * @version 1.0
 * @since 2020-08-08 00:50
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("user")
    public List<User> getUsers() {
        return userService.getUsers();
    }
}
