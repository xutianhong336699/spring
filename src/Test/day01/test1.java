package day01;

import cn.day01.HelloService;
import cn.day02.Printer;
import etity.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1 {
    @Test
    public void testBean(){
        // 创建一个Spring容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 从容器中获取指定的Bean , <-- "hellowService" 是xml配置文件里面的id -->
        HelloService service = ctx.getBean("hellowService",HelloService.class);
        System.out.println(service);
    }

    @Test
    public void testPerson(){
        // 创建一个Spring容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 从容器中获取指定的Bean , <-- "hellowService" 是xml配置文件里面的id -->
        Person person = ctx.getBean("person", Person.class);
        System.out.println(person.getName()+"在开"+person.getCar().getColor()+"的"+person.getCar().getBrand());
    }

    @Test
    public void testPrinter(){
        // 创建一个Spring容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 从容器中获取指定的Bean , <-- "hellowService" 是xml配置文件里面的id -->
        Printer printer = ctx.getBean("printer", Printer.class);
        printer.print();
        System.out.println("111111111111111111111");
    }

}
