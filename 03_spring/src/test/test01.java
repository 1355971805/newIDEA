import cn.happy.aop.User;
import cn.happy.aop.service.IUserBiz;
import cn.happy.aop.service.UserBiz;
import cn.happy.prints.pranter.printers;
import cn.happy.service.HappyService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 王 on 2017/7/23.
 */
public class test01 {
   //1.
    @Test
    public void tests() {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext.xml");

        HappyService service =(HappyService) cxt.getBean("happyService");
         //service.setInfo("spring");
          service.work();
    }

    @Test
    public void test() {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext.xml");

        printers service =(printers) cxt.getBean("printes");
        //service.setInfo("spring");
        service.print();
    }


    //aop
    @Test
    public void tesst() {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext.xml");

        IUserBiz service =(IUserBiz) cxt.getBean("userService");
        User user=new User();

        service.seav(user);
    }

}
