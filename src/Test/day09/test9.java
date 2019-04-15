package day09;

import cn.day09Bean.HelloService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test9 {
    @Test
    public void test(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext9.xml");
        HelloService helloService1 = ctx.getBean("hello", HelloService.class);
        System.out.println(helloService1);

        HelloService helloService2 = ctx.getBean("hello", HelloService.class);
        System.out.println(helloService2);

//        打印出来的地址不一样，说明创建了2个对象
    }
}
