package shiwu;

import cn.shiwu.entity.MyException;
import cn.shiwu.service.StockService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test{
    @Test
    public void testShiwu()  {
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
    }

}
