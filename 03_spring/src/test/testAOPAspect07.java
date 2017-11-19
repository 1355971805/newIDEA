




import cn.happy.Aspect06.ISomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 王 on 2017/7/23.
 */
public class testAOPAspect07 {
   //1.顾问
    @Test
    public void tests() {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContextsaop06aspectj.xml");

        ISomeService pp =(ISomeService) cxt.getBean("service");
        pp.ss();
        String result=pp.sss();
        System.out.println(result);

    }

    @Test
    public void testss() {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContextsaop06aspectj.xml");

        ISomeService pp =(ISomeService) cxt.getBean("service");
        pp.ss();
        pp.sss();


    }


}
