package com.alex.house.mapper;

import com.alex.house.common.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Jiaxin CHEN
 * @version 1.0
 * @since 2020-08-08-00-45
 */
@Mapper
public interface UserMapper {

    public List<User> getUsers();
}
