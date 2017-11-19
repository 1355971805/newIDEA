import cn.happy.proxy02.UserDaoImpl;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by 王 on 2017/7/30.
 */
public class testCglib {

    public void testCglib()
    {
        //拿到被代理类
        final UserDaoImpl dao=new UserDaoImpl();
/*        Enhancer是一个类*/
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(dao.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                System.out.println("=========before");
                Object result=method.invoke(dao,args);
                System.out.println("===========after");
                return result;
            }
        });
        //提供方法
        UserDaoImpl proxy=(UserDaoImpl)enhancer.create();
        proxy.ad();
    }

}
