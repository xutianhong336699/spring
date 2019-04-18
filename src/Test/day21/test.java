package day21;

import cn.day21.HelloService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test21(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext21.xml");
        HelloService helloService = (HelloService)ctx.getBean("helloService");
        helloService.fly();
        System.out.println("------------------");
        helloService.run();
        System.out.println("------------------");
        helloService.talk();
        System.out.println("------------------");
    }
}
