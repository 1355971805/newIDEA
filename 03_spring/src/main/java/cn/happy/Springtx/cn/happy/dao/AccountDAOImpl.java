package cn.happy.Springtx.cn.happy.dao;

import cn.happy.Springtx.cn.happy.entity.Account;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by Happy on 2017-08-04.
 */
public class AccountDAOImpl extends JdbcDaoSupport implements IAccountDAO {

    public boolean addAccount(Account account) {
        return false;
    }

    public boolean updateAccount(int aid, double money, boolean isBuy) {
        boolean flag=false;
        String sql=null;
        if (isBuy){  //购买股票
            sql="update account set balance=balance-? where aid=?";
        }else{
             sql="update account set balance=balance+? where aid=?";
        }
        int count = this.getJdbcTemplate().update(sql, money, aid);
        if (count>0){
            flag=true;
        }
        return flag;
    }
}















