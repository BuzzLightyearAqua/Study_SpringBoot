package com.buzz.dao;

import com.buzz.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author BuzzLightyear
 * @illustrate:
 * @data 2022/8/29 20:53
 */
@Mapper
public interface BookDao {
    @Select("SELECT * FROM tbl_book WHERE id = #{id}")
    public Book getById(Integer id);
}
