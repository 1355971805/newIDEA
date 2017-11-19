





import cn.happy.Springtx.cn.happy.entity.StockException;
import cn.happy.Springtx.cn.happy.service.IAccountService;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by 王 on 2017/7/23.
 */
public class testAOPjdbcTemplatetx {

    @Test
    public void tests() throws StockException {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContextjdbcTemplatetx.xml");
        IAccountService pp =(IAccountService) cxt.getBean("userService");
        try {
            pp.buyStock(1,2,1,20000);
        }catch (Exception e){

        }


        }
    }



