package day22;

import cn.day22.entity.Book;
import cn.day22.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class test {
    @Test
    public void test22(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext22.xml");
        BookService bookService = ctx.getBean("bookService", BookService.class);
        // 查
        List <Book> list = bookService.findAllBooks();
        for (Book item: list) {
            System.out.println(item.getBookname());
        }

        // 增
        Book book1 = new Book("舒克和贝塔",28);
        int count1 = bookService.addBook(book1);
        System.out.println(count1);

        // 删
        int count2 = bookService.delete(2);
        System.out.println(count2);

        // 改
        Book book2 = new Book(8,"北大青鸟",20);
        int count3 = bookService.update(book2);
        System.out.println(count3);
    }
}
