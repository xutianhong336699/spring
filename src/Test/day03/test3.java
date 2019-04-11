package day03;

import cn.day03.entity.User;
import cn.day03.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test3 {
    @Test
    public void test1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext3.xml");
        // 从容器中获取指定的Bean , <-- "userserviceimpl" 是xml配置文件里面service实现类的 id -->
        UserService userService = ctx.getBean("userserviceimpl", UserService.class);
        userService.saveUser(new User());
    }
}
