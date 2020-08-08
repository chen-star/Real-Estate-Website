package com.alex.house.common.model;

import lombok.Data;

/**
 * @author Alex CHEN
 * @version 1.0
 * @since 2020-08-08 00:43
 */
@Data
public class User {

    private Long id;
    private String name;
    private String phone;
    private String email;
}
