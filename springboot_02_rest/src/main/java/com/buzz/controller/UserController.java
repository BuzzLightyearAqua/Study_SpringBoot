package com.buzz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author BuzzLightyear
 * @illustrate:
 * @data 2022/8/24 14:59
 */
@Controller
public class UserController {

    @RequestMapping(value = "/users",method = RequestMethod.POST)
    @ResponseBody
    public String save(){
        System.out.println("user save...");
        return "{'module':'user save'}";
    }

    @RequestMapping(value = "/users/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable Integer id){     //@PathVariable:接收请求路径中占位符的值
        System.out.println("user delete..." + id);
        return "{'module':'user delete'}";
    }

    @RequestMapping(value = "/users/{user}",method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestParam User user){
        System.out.println("user update" + user);
        return "{'module':'user update'}";
    }

    @RequestMapping(value = "/users/{id}/{user}", method = RequestMethod.GET)
    @ResponseBody
    public String getById(@PathVariable Integer id,@PathVariable String user) {
        System.out.println("user1 getById..." + id + user);
        return "{'module':'user1 getById'}";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public String getAll() {
        System.out.println("user1 getAll...");
        return "{'module':'user1 getAll'}";
    }
}
