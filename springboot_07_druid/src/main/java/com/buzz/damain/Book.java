package com.buzz.damain;

import lombok.Data;
import lombok.ToString;

/**
 * @author BuzzLightyear
 * @illustrate:
 * @data 2022/9/2 21:29
 */
@Data
@ToString
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
