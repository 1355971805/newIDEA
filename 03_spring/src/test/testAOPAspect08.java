




import cn.happy.Aspect07.ISomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 王 on 2017/7/23.
 */
public class testAOPAspect08 {
   //1.顾问
    @Test
    public void tests() {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContextsaop07aspectj.xml");

        ISomeService pp =(ISomeService) cxt.getBean("service");
        pp.ss();
        pp.sss();
    }


}
