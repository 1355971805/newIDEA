





import cn.happy.Advisor08.ISomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 王 on 2017/7/23.
 */
public class testAOPAspect08Zidong {
   //1.顾问
    @Test
    public void tests() {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContextsaopZidong08.xml");

        ISomeService pp =(ISomeService) cxt.getBean("someService");
        pp.ss();
        pp.sss();
    }


}
