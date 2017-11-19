package cn.happy.proxy;

/**
 * Created by 王 on 2017/7/30.
 */
public class RealSubject implements Subject {

    public void service() {
        System.out.println("service");
    }
}
