package cn.happy.aop.service;

import cn.happy.aop.IDAO;
import cn.happy.aop.User;

/**
 * Created by 王 on 2017/7/23.
 */
public class UserBiz implements IUserBiz {
    private IDAO dao;

    public IDAO getDao() {
        return dao;
    }

    public void setDao(IDAO dao) {
        this.dao = dao;
    }

    public void seav(User user) {

        dao.seave(user);

    }
}
