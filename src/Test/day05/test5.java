package day05;

import cn.day05autowire.entity.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test5 {
    @Test // autowire 自动注入
    public void test(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext5.xml");
        Emp emp = ctx.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
