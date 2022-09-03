package com.buzz.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.buzz.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author BuzzLightyear
 * @illustrate:使用mybatisplus 继承BaseMapper
 * @data 2022/9/3 9:35
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {
    /**
     * 传统方式
     */
    //@Select("SELECT * FROM tbl_book WHERE id = #{id}")
    //Book getById(Integer id);
}
