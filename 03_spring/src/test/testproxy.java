import cn.happy.proxy.RealSubject;
import cn.happy.proxy.proxy;
import cn.happy.proxy02.IUserDAO;
import cn.happy.proxy02.UserDaoImpl;
import cn.happy.zhu.Niubi;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by 王 on 2017/7/23.
 */
public class testproxy {

    @Test
    public void tests() {
        proxy proxy=new proxy();
        RealSubject realSubject=new RealSubject();
        proxy.setRs(realSubject);
        proxy.service();
    }
    @Test
    public void tess() {
        //父类变量只想子类对象
        final IUserDAO dao = new UserDaoImpl();

        //2.使用一个东西xxxx产生一个代理对象
        IUserDAO proxy = (IUserDAO) Proxy.newProxyInstance(dao.getClass().getClassLoader(), dao.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("============before");
                Object result = method.invoke(dao, args);
                System.out.println("after============");
                return result;
            }
        });
        proxy.ad();
        proxy.edit();


    }}
