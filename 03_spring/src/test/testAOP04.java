
import cn.happy.spring04method.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 王 on 2017/7/23.
 */
public class testAOP04 {
   //1.
    @Test
    public void tests() {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContextsaop02.xml");

        SomeService service =(SomeService) cxt.getBean("proxService");
        service.ss();
    }


}
