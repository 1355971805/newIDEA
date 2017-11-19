





import cn.happy.Advisor08.ISomeService;
import cn.happy.jdbcTemplate.entity.Book;
import cn.happy.jdbcTemplate.service.IBookDaoService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by 王 on 2017/7/23.
 */
public class testAOPjdbcTemplate {
   //1.顾问
    @Test
    public void tests() {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContextjdbcTemplate.xml");

        IBookDaoService pp =(IBookDaoService) cxt.getBean("userService");
        List<Book>list=pp.finds();
        for (Book temp:list
             ) {
            System.out.println(temp.getBookname());
        }
    }


}
