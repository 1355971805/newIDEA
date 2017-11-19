package cn.happy.Aspect06;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by 王 on 2017/7/30.
 */
@Aspect
public class MyAspect {
    //前置增强
 @Before("execution(* *..Aspect06.*.*(..))")
    public void myBefore(){
        System.out.println("-----------之前");
    }

    //后置增强
   //@AfterReturning("execution(* *..Aspect06.*.*(..))")
    public void myAfter(){
        System.out.println("-----------之后");
    }


    //@Around("execution(* *..Aspect06.*.*(..))")
    public Object myArounds(ProceedingJoinPoint proceed) throws Throwable {
        System.out.println("------------之前");
        Object result = proceed.proceed();
        System.out.println("-----------之后");
        if (result!=null){
           String str=(String)result;
           return str.toUpperCase();
        }else {
            return null;
        }

    }
    //@AfterThrowing("execution(* *..Aspect06.*.*(..))")
    public void mythro(){
        System.out.println("-----------错误");
    }

    @After("execution(* *..Aspect06.*.*(..))")
    public void after(){
        System.out.println("-----------好");
    }

}
