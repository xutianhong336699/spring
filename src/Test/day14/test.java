package day14;

import cn.day12.aroundAdvice.HelloService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test12(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext14.xml");
        HelloService helloService = (HelloService)ctx.getBean("proxyService");
        helloService.run();
    }
}
