package com.buzz;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author BuzzLightyear
 * @illustrate:
 * @data 2022/8/29 10:47
 */
@Data
@ToString
/**
 * 1.定义数据模型封装yaml文件中对应的数据
 * 2.定义为spring管控的bean
 * 3.指定加载的数据
 */
@Component
@ConfigurationProperties(prefix = "datasource")
public class MyDataSource {
    private String driver;
    private String url;
    private String username;
    private String password;
}
