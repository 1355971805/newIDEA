


import cn.happy.Advisor.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 王 on 2017/7/23.
 */
public class testAOPAdivosr06 {
   //1.顾问
    @Test
    public void tests() {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContextsaop0Advice4.xml");

        SomeService service =(SomeService) cxt.getBean("proxService");
        service.ss();
        service.sss();
    }


}
