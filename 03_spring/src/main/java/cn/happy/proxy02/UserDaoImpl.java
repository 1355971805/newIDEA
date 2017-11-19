package cn.happy.proxy02;

/**
 * Created by 王 on 2017/7/30.
 */
public class UserDaoImpl implements IUserDAO {
    public void ad() {
        System.out.println("add success");
    }

    public String edit() {
        System.out.println("edit ");
        return "edit";
    }
}
