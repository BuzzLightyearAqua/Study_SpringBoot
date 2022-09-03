package com.buzz;

import com.buzz.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = JunitApplication.class)
class Springboot04JunitApplicationTests {

    //1.注入需要测试的对象
    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {
        //2.执行要测试对象的方法
        bookDao.save();
        System.out.println("JUnit测试...");
    }

}
