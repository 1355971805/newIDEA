package cn.happy.service;

/**
 * Created by 王 on 2017/7/23.
 */
public class HappyService {
    private  String info;
public void work(){
    System.out.println("hello"+info);
}
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
