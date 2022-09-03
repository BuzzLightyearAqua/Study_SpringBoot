package com.buzz.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.buzz.domain.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author BuzzLightyear
 * @illustrate:
 * @data 2022/9/2 21:06
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {
}
