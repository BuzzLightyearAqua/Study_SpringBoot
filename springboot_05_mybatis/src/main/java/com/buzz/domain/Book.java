package com.buzz.domain;

import lombok.Data;
import lombok.ToString;

/**
 * @author BuzzLightyear
 * @illustrate:
 * @data 2022/8/29 19:49
 */
@Data
@ToString
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;     //描述
}
