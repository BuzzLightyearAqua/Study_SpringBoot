package com.buzz.dao;

import com.buzz.damain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author BuzzLightyear
 * @illustrate:
 * @data 2022/9/2 21:30
 */
@Mapper
public interface BookDao {
    @Select("SELECT * FROM tbl_book WHERE id = #{id}")
    public Book getById(Integer id);
}
