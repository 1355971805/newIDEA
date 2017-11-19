package cn.happy.Aspect06;

/**
 * Created by 王 on 2017/7/30.
 */
public class SomeService implements ISomeService {
    public void ss(){
        //int i=5/0;
        System.out.println("我们都可以");
    }

    public String sss() {

        System.out.println("可以");
        return "add";
    }

}
