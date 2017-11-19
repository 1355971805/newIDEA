







import cn.happy.spring21ssmxml.entity.Book;
import cn.happy.spring21ssmxml.service.IBookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 王 on 2017/7/23.
 */
public class testSpringMyBatis {

    @Test
    public void tests(){
        ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContextspring19ssm.xml");
        IBookService pp =(IBookService) cxt.getBean("servvice");
        Book book=new Book();
        book.setBookName("qiqiiq");
        book.setBookPrice(20);
        pp.addBook(book);


        }
    }



