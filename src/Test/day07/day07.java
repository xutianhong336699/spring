package day07;

import cn.day07annotation.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class day07 {
    @Test
    public void test(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext7.xml");
        Book book = ctx.getBean("book", Book.class);
//        System.out.println(book);
        System.out.println(book.getBookid()+"\t"+book.getBookname()+"\t"+book.getPub().getPublishername());
    }
}
