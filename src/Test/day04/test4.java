package day04;

import cn.day04constructInjection.entity.UserInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test4 {

    @Test // 构造注入测试
    public void test1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext4.xml");
        UserInfo userinfo1 = ctx.getBean("userinfo", UserInfo.class);
        System.out.println(userinfo1);
    }

    @Test // p命名空间注入测试
    public void test2(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext4.xml");
        UserInfo userinfo2 = ctx.getBean("user", UserInfo.class);
        System.out.println(userinfo2);
    }
}
