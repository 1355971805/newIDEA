package cn.happy.Aspect07;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by 王 on 2017/7/30.
 */

public class MyAspect {
    //前置增强

    public void myBefore(){
        System.out.println("-----------之前");
    }
}
