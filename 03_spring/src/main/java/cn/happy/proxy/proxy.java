package cn.happy.proxy;

/**
 * Created by 王 on 2017/7/30.
 */
public class proxy implements Subject {
   private RealSubject rs;
    public void service() {
        if (rs==null){
            rs=new RealSubject();
        }
        System.out.println("=========befure");
        rs.service();
        System.out.println("=======after");
    }

    public RealSubject getRs() {
        return rs;
    }

    public void setRs(RealSubject rs) {
        this.rs = rs;
    }
}
