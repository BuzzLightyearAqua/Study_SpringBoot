package com.buzz.dao;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.buzz.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
/**
 * @author BuzzLightyear
 * @illustrate:
 * @data 2022/9/3 9:38
 */
@SpringBootTest
public class BookDaoTest {

    @Autowired
    private BookDao bookDao;
    //根据ID获取
    @Test
    void GetByIdTest() {
        System.out.println(bookDao.selectById(3));
    }
    //添加
    @Test
    void save(){
        Book book = new Book();
        book.setName("金刚经");
        book.setType("宗教");
        book.setDescription("《金刚般若波罗蜜经》，简称《金刚经》，是大乘佛教般若部重要经典之一。");
        System.out.print(bookDao.insert(book));
        System.out.println("新增《" +book.getName() + "》的ID为" + book.getId());
    }
    //修改
    @Test
    void UpData(){
        Book book = new Book();
        book.setId(15);
        book.setName("楞严经");
        book.setType("宗教");
        book.setDescription("《楞严经》全经名《大佛顶如来密因修证了义诸菩萨万行首楞严经》，是佛教的一部极为重要的经典。");
        System.out.print(bookDao.updateById(book));
        System.out.println("修改《" +book.getName() + "》");
    }
    //查询所有数据
    @Test
    void GetAll(){
        List<Book> books = bookDao.selectList(null);
        System.out.println(books);
    }
    //删除
    @Test
    void DeleteById(){
        System.out.println(bookDao.deleteById(14));
    }
    @Test
    void testGetPage(){
        IPage page = new Page(1,3);     //一页显示三条数据
        bookDao.selectPage(page,null);
    }
}
