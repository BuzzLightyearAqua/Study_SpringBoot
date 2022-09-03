package com.buzz.controller;

import com.buzz.MyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BuzzLightyear
 * @illustrate:
 * @data 2022/8/28 20:48
 */
@RestController
@RequestMapping("/books")
public class bookController {

    @Value("${user.name}")
    private String user;

    @Value("${likes[1]}")   //读取单个数据
    private String like;

    @Value("${tempDir}")
    private String temp;

    //使用自动装配将所有的数据封装到一个对象Environment中
    @Autowired
    private Environment env;

    @Autowired
    private MyDataSource myDataSource;

    @GetMapping
    public String getById(){
        System.out.println("spring boot is run...");
        System.out.println("user--->"+user);
        System.out.println("like--->"+like);
        System.out.println("temp--->"+temp);
        System.out.println("--------------------------");
        System.out.println(env.getProperty("tempDir"));
        System.out.println(env.getProperty("user.name"));
        System.out.println(env);
        System.out.println("--------------------------");
        System.out.println(myDataSource);
        return "spring boot is run...";
    }
}
