package day20;

import cn.day20.HelloService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test20(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext20.xml");
        HelloService helloService = (HelloService)ctx.getBean("helloService");
        helloService.fly();
        System.out.println("-------------------");
        helloService.dorun();
        System.out.println("-------------------");
        helloService.dotalk();
        System.out.println("-------------------");
    }
}
