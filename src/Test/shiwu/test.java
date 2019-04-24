package shiwu;

import cn.shiwu.entity.MyException;
import cn.shiwu.service.StockService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test{

    //  第一种方法：事务代理工厂Bean
    /*@Test
    public void testShiwu1()  {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContextShiwu.xml");
        StockService stockService = (StockService)ctx.getBean("proxyBean");
        int count = 0;
        try {
            count = stockService.buyStock(1,165,1,1);
        } catch (MyException e) {
            e.printStackTrace();
        }
        if(count>0){
            System.out.println("购买成功!");
        }
    }*/

    //  第二种方法：注解驱动
   /* @Test
    public void testShiwu2()  {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContextShiwu.xml");
        StockService stockService = (StockService)ctx.getBean("stockService");
        int count = 0;
        try {
            count = stockService.buyStock(1,165,1,1);
        } catch (MyException e) {
            e.printStackTrace();
        }
        if(count>0){
            System.out.println("购买成功!");
        }
    }*/

    //  第三种方法：Aspect方式
    @Test
    public void testShiwu3()  {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContextShiwu.xml");
        StockService stockService = (StockService)ctx.getBean("stockService");
        int count = 0;
        try {
            count = stockService.buyStock(1,165,1,1);
        } catch (MyException e) {
            e.printStackTrace();
        }
        if(count>0){
            System.out.println("购买成功!");
        }
    }

}
