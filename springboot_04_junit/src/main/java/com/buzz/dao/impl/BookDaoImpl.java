package com.buzz.dao.impl;

import com.buzz.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @author BuzzLightyear
 * @illustrate:
 * @data 2022/8/29 16:03
 */

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("TEST IS RUN......");
    }
}
