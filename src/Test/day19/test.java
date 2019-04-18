package day19;

import cn.day18auto02.AnyService;
import cn.day18auto02.HelloService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test16(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext19.xml");
        HelloService helloService = (HelloService)ctx.getBean("helloService");
        helloService.dorun();
        System.out.println("-----------------");
        helloService.dotalk();
        System.out.println("-----------------");
        helloService.fly();
        System.out.println("-----------------");
        AnyService anyService = (AnyService)ctx.getBean("anyService");
        anyService.dorun();
        System.out.println("-----------------");
        anyService.dotalk();
        System.out.println("-----------------");
    }
}
