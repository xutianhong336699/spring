package day17;

import cn.day17advisor02.HelloService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test16(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext17.xml");
        HelloService helloService = (HelloService)ctx.getBean("proxyService");
        helloService.dorun();
        System.out.println("-----------------");
        helloService.dotalk();
        System.out.println("-----------------");
        helloService.fly();
    }
}
