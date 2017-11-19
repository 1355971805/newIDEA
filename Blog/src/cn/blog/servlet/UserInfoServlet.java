package cn.blog.servlet;

import cn.blog.dao.IUserInfoDAO;
import cn.blog.dao.iimpl.UserInfoDAOImpl;
import cn.blog.entity.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Happy on 2017-06-30.
 */
public class UserInfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //write code here please ,oK?
        //使用dao实现类
        IUserInfoDAO dao=new UserInfoDAOImpl();
        String userCode=request.getParameter("userCode");
        String userPwd=request.getParameter("userPwd");
        UserInfo info=new UserInfo();
        System.out.println(userCode+"===================");
        info.setUserCode(Integer.parseInt(userCode));
        info.setUserPwd(userPwd);
        try {
            boolean flag = dao.isLogin(info);
            if (flag){
                request.getRequestDispatcher("/BlogHtTemplate-master/html/main.html").forward(request,response);
            }else{
                response.sendRedirect("/BlogHtTemplate-master/html/index.html");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //  dao.isLogin();
        //跳转

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
