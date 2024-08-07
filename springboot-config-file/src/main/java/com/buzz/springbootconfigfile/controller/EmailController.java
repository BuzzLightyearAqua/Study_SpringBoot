package com.buzz.springbootconfigfile.controller;

import com.buzz.springbootconfigfile.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    //注入email配置信息实体类
    @Autowired
    private EmailService emailService;

    //测试方法
    @RequestMapping("/send")
    public Boolean send(){
        //收件人信箱
        String to = "buzzlightyear0131@163.com";

        //邮箱标题
        String title = "测试邮件";

        //邮件正文
        String content = "巴斯光年";

        //发送邮件
        boolean flag = emailService.send(to, title, content);
        return flag;
    }
}
