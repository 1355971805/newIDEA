package cn.happy.Advisor;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by 王 on 2017/7/30.
 */
public class MyAfterRe implements AfterReturningAdvice{
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("------------------之后");
    }
}
