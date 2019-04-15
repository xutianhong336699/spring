package day13;

import cn.day12.afterAdvice.HelloService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test13 {
    @Test
    public void test(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext13.xml");
        HelloService helloService = (HelloService)ctx.getBean("proxyService");
        helloService.run();
    }
}
