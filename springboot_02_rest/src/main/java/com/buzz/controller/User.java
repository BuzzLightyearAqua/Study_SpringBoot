package com.buzz.controller;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author BuzzLightyear
 * @illustrate:
 * @data 2022/8/24 14:56
 */
@Component
@Data
public class User {
    private Integer userId;
    private String userName;
    private String userPassword;
}
