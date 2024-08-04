package com.buzz.springbootconfigfile.pojo;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ToString
@Component
@ConfigurationProperties(prefix = "email")
public class EmailProperties {

    //发件人邮箱
    // @Value("${email.user}")
    public String user;

    //发件人邮箱授权码
    // @Value("${email.code}")
    public String code;

    //发件人邮箱对应的服务器域名
    // @Value("${email.host}")
    public String host;

    //身份验证开关
    // @Value("${email.auth}")
    public boolean auth;

    public boolean isAuth() {
        return auth;
    }

}
