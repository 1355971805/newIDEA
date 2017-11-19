package cn.blog.dao.iimpl;

import cn.blog.dao.BaseDao;
import cn.blog.dao.IUserInfoDAO;
import cn.blog.entity.UserInfo;
import cn.blog.entity.customer;
import org.junit.Test;


import java.beans.Customizer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Happy on 2017-06-30.
 */
public class UserInfoDAOImpl extends BaseDao implements IUserInfoDAO {
   @Test
   public void testIsLogin(){
       UserInfo info=new UserInfo();
       info.setUserCode(1);
       info.setUserPwd("123456");
       try {
           boolean flag = isLogin(info);
           System.out.println(flag);
       } catch (Exception e) {
           e.printStackTrace();
       }
   }


    public boolean isLogin(UserInfo info) throws Exception {
        boolean flag=false;
        //根据用户名和密码查看复合条件的记录有几条》》》》》》》》》》》》》》
        String  sql="select count(1) as UserCode from userInfo where UserCode=? and UserPwd=?";
        Object[] paras={info.getUserCode(),info.getUserPwd()};
        ResultSet rs = executeQuery(sql, paras);
        if (rs.next()){
            if (rs.getInt("UserCode")>0){
                flag=true;
            }
        }
        closeAll();
        return flag;
    }


    @Test
    public void gets() throws Exception {
        List<customer> flag=setCustomer();
        for (customer admins : flag) {
            System.out.print(admins.getUid());
        }


    }
    public List<customer> setCustomer() throws Exception {
        List<customer>list=new ArrayList<customer>();
        String sql="select * from customer";
        ResultSet rs=executeQuery(sql);
        while (rs.next()) {
       customer cs=new customer();
       cs.setUid(rs.getInt("uid"));
       cs.setUname(rs.getString("uname"));
       cs.setUsex(rs.getString("usex"));
       cs.setUage(rs.getString("uage"));
       cs.setUtime(rs.getString("utime"));
       list.add(cs);
        }
        closeAll();
        return list;

    }



}
