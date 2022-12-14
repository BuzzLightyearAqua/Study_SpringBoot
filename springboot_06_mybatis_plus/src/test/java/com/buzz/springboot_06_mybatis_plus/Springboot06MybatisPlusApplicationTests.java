package com.buzz.springboot_06_mybatis_plus;

import com.buzz.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot06MybatisPlusApplicationTests {

    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {
        System.out.println(bookDao.selectById(1));
        System.out.println(bookDao.selectList(null));
        System.out.println(bookDao.selectById(2));

    }

}
