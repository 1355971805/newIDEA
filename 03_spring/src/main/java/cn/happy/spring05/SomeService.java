package cn.happy.spring05;

/**
 * Created by 王 on 2017/7/30.
 */
public class SomeService implements ISomeService {

    public void ss(){
        int i=5/0;
        System.out.println("我们都可以");
    }
}
