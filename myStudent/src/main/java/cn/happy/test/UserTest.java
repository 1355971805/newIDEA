package cn.happy.test;

import cn.happy.entity.Student;
import cn.happy.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by 王 on 2017/8/9.
 */
public class UserTest {


    @Test
    public void aa(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContextspring19ssm.xml");
        IUserService service=(IUserService)context.getBean("sqlservice");
         List<Student>list= service.selectStudent();
        for (Student item:list
             ) {
            System.out.println(item.getSclass().getNname());
        }

    }
}
