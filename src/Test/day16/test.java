package day16;

import cn.day16advisor01.HelloService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test16(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext16.xml");
        HelloService helloService = (HelloService)ctx.getBean("proxyService");
        helloService.run();
        System.out.println("-----------------");
        helloService.talk();
    }
}
