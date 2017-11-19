package cn.happy.spring05;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.ThrowsAdvice;

/**
 * Created by 王 on 2017/7/30.
 */

public class MyThrows implements ThrowsAdvice {
    public void afterThrowing(Exception ex){
        System.out.println("错误");
    }
}
