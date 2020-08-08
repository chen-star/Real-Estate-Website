package com.alex.house.service;

import com.alex.house.common.model.User;
import com.alex.house.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Alex CHEN
 * @version 1.0
 * @since 2020-08-08 00:51
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getUsers() {
        return userMapper.getUsers();
    }
}
