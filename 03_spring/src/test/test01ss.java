import cn.happy.day03.Car;
import cn.happy.day03.Connection;
import cn.happy.day03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

/**
 * Created by 王 on 2017/7/23.
 */
public class test01ss {
    //1.
    @Test
    public void tests() {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContexts.xml");

        Connection service = (Connection) cxt.getBean("conn");
        String[] name = service.getNames();
        for (String item : name) {
            System.out.println(item);
        }
    }

    @Test
    public void tesats() {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContexts.xml");

        Connection service = (Connection) cxt.getBean("lists");
        List<Car> list = service.getList();
        for (Car item : list
                ) {
            System.out.println(item.getColor());
        }


    }

    //map
    @Test
    public void tesasts() {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContexts.xml");

        Connection service = (Connection) cxt.getBean("mapcon");
        Map<String, Car> map = service.getMap();
        for (String item : map.keySet()
                ) {
            System.out.println(item);
            System.out.println(map.get(item).getColor());
        }

    }

    //properties
    @Test
    public void tesassts() {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContexts.xml");

        Connection service = (Connection) cxt.getBean("pro");
        System.out.println(service.getProperties());

    }
}