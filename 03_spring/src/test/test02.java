import cn.happy.aop.User;
import cn.happy.aop.service.IUserBiz;
import cn.happy.prints.pranter.printers;
import cn.happy.service.HappyService;
import cn.happy.zhu.Niubi;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 王 on 2017/7/23.
 */
public class test02 {
   //1.
    @Test
    public void tests() {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContexts01.xml");

        Niubi service =(Niubi) cxt.getBean("niubi");
        System.out.println(service);
    }


}
