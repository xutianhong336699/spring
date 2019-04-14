package day06;

import cn.day06collectioninject.entity.Collection;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class test6 {
    @Test
    public void test1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext6.xml");
        Collection collection = ctx.getBean("collection", Collection.class);

        // array数组注入
        for (String item:collection.getArray()) {
            System.out.println(item);
        }
        System.out.println("----------------------");

        // list集合注入
        for (String item:collection.getList()) {
            System.out.println(item);
        }
        System.out.println("----------------------");

        // set集合注入
        for (String item:collection.getSetlist()) {
            System.out.println(item);
        }
        System.out.println("----------------------");

        // map集合注入
        for (String item: collection.getMap().keySet()) {
            System.out.println(item+"\t"+collection.getMap().get(item));
        }
        System.out.println("----------------------");

        // Properties注入
        for (Object item: collection.getProperties().keySet()) {
            System.out.println(item+"\t"+collection.getProperties().get(item));
        }
        System.out.println("----------------------");

    }
}
