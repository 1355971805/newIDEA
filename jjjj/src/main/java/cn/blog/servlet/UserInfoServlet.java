package cn.blog.servlet;

import cn.blog.dao.IUserInfoDAO;
import cn.blog.dao.IVisitlogDAO;
import cn.blog.dao.iimpl.UserInfoDAOImpl;
import cn.blog.dao.iimpl.visitLogDaoImpl;
import cn.blog.entity.UserInfo;
import cn.blog.entity.customer;
import cn.blog.entity.visitLog;
import javafx.scene.chart.PieChart;
import org.bouncycastle.asn1.dvcs.Data;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * Created by Happy on 2017-06-30.
 */
public class UserInfoServlet extends HttpServlet {
    public String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //write code here please ,oK?
        //使用dao实现类
       request.setCharacterEncoding("utf-8");
       response.setCharacterEncoding("utf-8");
        IUserInfoDAO dao=new UserInfoDAOImpl();
        IVisitlogDAO dao1=new visitLogDaoImpl();
        String action=request.getParameter("action");
        if("zhuxiao".equals(action)){

                //执行注销操作

                //1.清除session
                request.getSession().removeAttribute("userCode");
                //2.跳转到index
			/*response.sendRedirect("/NewsManagerSystem/index.jsp");*/

                request.getRequestDispatcher("/index.jsp").forward(request, response);
        }else
        if("setNews".equals(action)){
            List<customer>list=null;
            try {
               list=dao.setCustomer();
            } catch (Exception e) {
                e.printStackTrace();
            }
            request.setAttribute("list",list);
            request.getRequestDispatcher("BlogHtTemplate-master/html/masters.jsp").forward(request,response);
        }else {


            String userCode = request.getParameter("userCode");
            String userPwd = request.getParameter("userPwd");
            UserInfo info = new UserInfo();
            info.setUserCode(Integer.parseInt(userCode));
            info.setUserPwd(userPwd);
            try {
                boolean flag = dao.isLogin(info);
                if (flag) {
                    String add=getIpAddr(request);
                    System.out.println(add);
                    visitLog log=new visitLog();
                    log.setIpAddress(add);
                    log.setVisitTime(new Date());
                    dao1.addIp(log);


                    System.out.print("成功");
                    request.getRequestDispatcher("/BlogHtTemplate-master/html/main.html").forward(request, response);
                } else {
                    System.out.print("失败");
                    response.sendRedirect("/BlogHtTemplate-master/html/index.html");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
