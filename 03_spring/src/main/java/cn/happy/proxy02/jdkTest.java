package cn.happy.proxy02;

import cn.happy.zhu.Niubi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by 王 on 2017/7/23.
 */
public class jdkTest {
@Test
    public void tests() {
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

    }
    @Test
    public void tests1() {
        //父类变量只想子类对象
        final IUserDAO dao = new UserDaoImpl();

        //2.使用一个东西xxxx产生一个代理对象
        IUserDAO proxy = (IUserDAO) Proxy.newProxyInstance(dao.getClass().getClassLoader(), dao.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("事物开启");
                method.invoke(dao,args);
                return null;
            }
        });
        proxy.edit();
        proxy.ad();


    }
}
