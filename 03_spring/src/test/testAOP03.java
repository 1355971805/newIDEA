import cn.happy.springaop.ISomeService;
import cn.happy.springaop.SomeService;
import cn.happy.zhu.Niubi;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 王 on 2017/7/23.
 */
public class testAOP03 {
   //1.
    @Test
    public void tests() {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContextsaop01.xml");

        SomeService service =(SomeService) cxt.getBean("proxService");
        service.ss();
    }


}
