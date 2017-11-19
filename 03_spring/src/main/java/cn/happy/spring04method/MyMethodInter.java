package cn.happy.spring04method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * Created by 王 on 2017/7/30.
 */
public class MyMethodInter implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("befor");
        methodInvocation.proceed();
        System.out.println("after");
        return null;
    }
}
