

import cn.happy.spring05.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 王 on 2017/7/23.
 */
public class testAOP05 {
   //1.
    @Test
    public void tests() {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContextsaop03.xml");

        SomeService service =(SomeService) cxt.getBean("proxService");
        service.ss();
    }


}
