package day12;

import cn.day12.beforeAdvice.HelloService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test12 {
    @Test
    public void test(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext12.xml");
        HelloService helloService = (HelloService)ctx.getBean("proxyService");
        helloService.run();
    }
}
