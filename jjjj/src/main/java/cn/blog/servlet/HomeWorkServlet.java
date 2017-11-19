package cn.blog.servlet;

import cn.blog.dao.IhomeworkDao;
import cn.blog.dao.iimpl.HomeWorkDaoImpl;
import cn.blog.entity.homework;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


/**
 * Created by 王 on 2017/7/7.
 */
@WebServlet(name = "HomeWorkServlet")
public class HomeWorkServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        IhomeworkDao dao=new HomeWorkDaoImpl();
        request.setCharacterEncoding("utf-8");

        String action=request.getParameter("action");
        if ("setHome".equals(action)){
            try {
                List<homework> list = dao.getHome();
                request.setAttribute("list", list);
                request.getRequestDispatcher("/BlogHtTemplate-master/html/Teacher/setList.jsp").forward(request, response);
            } catch (Exception e) {
                e.printStackTrace();
            }


        }else {
            String homeGrade = request.getParameter("homeGrade");
            String homeTacher = request.getParameter("homeTacher");
            String homeChapter = request.getParameter("homeChapter");
            String homeContent = request.getParameter("homeContent");


            try {

                homework work = new homework();
                work.setHomeGrade(homeGrade);
                work.setHomeTacher(homeTacher);
                work.setHomeChapter(homeChapter);
                work.setHomeContent(homeContent);
                work.setHomeTime(new Date());

                boolean flag = dao.addList(work);
                if (flag) {
                    request.getRequestDispatcher("/HomeWorkServlet?action=setHome").forward(request, response);
                }

            } catch (ParseException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request,response);
    }
}
