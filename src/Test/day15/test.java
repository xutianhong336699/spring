package day15;

import cn.day12.throwsAdvice.HelloService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test15(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext15.xml");
        HelloService helloService = (HelloService)ctx.getBean("proxyService");
        try {
            helloService.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
