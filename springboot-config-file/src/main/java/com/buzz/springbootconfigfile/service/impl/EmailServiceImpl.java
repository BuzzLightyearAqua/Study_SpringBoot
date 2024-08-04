package com.buzz.springbootconfigfile.service.impl;

import com.buzz.springbootconfigfile.pojo.EmailProperties;
import com.buzz.springbootconfigfile.service.EmailService;
import com.buzz.springbootconfigfile.utils.MailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    //注入email配置信息实体类
    @Autowired
    private EmailProperties emailProperties;

    @Override
    public boolean send(String to, String title, String content) {
        //打印Email配置信息
        System.out.println(emailProperties);
        //发送邮件
        boolean flag = MailUtil.sendMail(emailProperties, to, title, content);
        return flag;
    }

}
