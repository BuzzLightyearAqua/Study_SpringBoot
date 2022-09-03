package com.buzz.domain;

import lombok.Data;
import lombok.ToString;

/**
 * @author BuzzLightyear
 * @illustrate:
 * @data 2022/9/2 21:04
 */

@Data
@ToString
public class Book {
    private Integer id;
    private String name;
    private String type;
    private String description;
}
