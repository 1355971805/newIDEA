package cn.blog.dao;

import cn.blog.entity.BlogInfo;
import cn.blog.entity.UserInfo;
import cn.blog.entity.customer;

import java.util.List;

/**
 * Created by Happy on 2017-06-30.
 */
public interface IUserInfoDAO {
    //判定用户是否登录成功！
    public boolean isLogin(UserInfo info) throws Exception;
    //用户列表
    public List<customer> setCustomer() throws Exception;


}
