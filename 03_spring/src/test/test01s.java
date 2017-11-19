import cn.happy.aop.User;
import cn.happy.aop.service.IUserBiz;
import cn.happy.day03.Student;
import cn.happy.prints.pranter.printers;
import cn.happy.service.HappyService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 王 on 2017/7/23.
 */
public class test01s {
   //1.命名空间
    @Test
      public void tests() {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContexts.xml");

        Student service =(Student) cxt.getBean("stus");
        System.out.println(service.getCar()+"-----------------"+service.getName());
        System.out.println(service);
    }


}
