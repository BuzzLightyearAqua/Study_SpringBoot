package com.buzz.domain;

import lombok.Data;
import lombok.ToString;

/**
 * @author BuzzLightyear
 * @illustrate:
 * @data 2022/9/3 9:30
 */
@Data
@ToString
public class Book {
    private Integer id;
    private String name;
    private String type;
    private String description;
}
