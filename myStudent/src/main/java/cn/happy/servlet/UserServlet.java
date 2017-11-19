package cn.happy.servlet;


import cn.happy.entity.Sclass;
import cn.happy.entity.Student;
import cn.happy.service.IUserService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * Created by 王 on 2017/8/7.
 */

public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     request.setCharacterEncoding("utf-8");
        WebApplicationContext wac = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        IUserService sqlservice = (IUserService) wac.getBean("sqlservice");

     String action=request.getParameter("action");
     if ("updateStu".equals(action)){
     int id=Integer.parseInt(request.getParameter("id"));
     String name=request.getParameter("sname");
     int grade=Integer.parseInt(request.getParameter("sgrade"));
     String score=request.getParameter("score");
     String subject=request.getParameter("subject");
     Student student=new Student();
     student.setSid(id);
     student.setSname(name);
     student.setGrade(grade);
     student.setScore(score);
     student.setSubject(subject);
         int count = sqlservice.updateScore(student);
         if (count>0){
             request.getRequestDispatcher("/UserServlet?action=stu").forward(request,response);
         }else{
             request.getRequestDispatcher("/updateScore.jsp").forward(request,response);
         }

     }else

     if ("setstu".equals(action)){

         int id=Integer.parseInt(request.getParameter("idss"));
         Student student = sqlservice.setStu(id);
         request.setAttribute("score",student);
         request.getRequestDispatcher("/updateScore.jsp").forward(request,response);
     }else
  if ("delScore".equals(action)){
      int id=Integer.parseInt(request.getParameter("ids"));
      int count = sqlservice.delScore(id);
      if (count>0){
          request.getRequestDispatcher("/UserServlet?action=stu").forward(request,response);
      }else{
          request.getRequestDispatcher("/Score.jsp").forward(request,response);
      }
  }else
     if ("addGrade".equals(action)){
         String grade=request.getParameter("grade");
         String sname=request.getParameter("sname");
         String score=request.getParameter("score");
         String subject=request.getParameter("subject");
         Student student=new Student();
         student.setGrade(Integer.parseInt(grade));
         student.setSname(sname);
         student.setScore(score);
         student.setStime(new Date());
         student.setSubject(subject);
         int count = sqlservice.addGrade(student);
         if (count>0){
             request.getRequestDispatcher("/UserServlet?action=stu").forward(request,response);
         }else {
             request.getRequestDispatcher("/addScore.jsp").forward(request,response);
         }

     }else
     if ("all".equals(action)){
         List<Sclass>list=sqlservice.getAll();
         request.setAttribute("list",list);
         request.getRequestDispatcher("/Grade.jsp").forward(request, response);

     }else
     if ("adds".equals(action)){
         int nid=Integer.parseInt(request.getParameter("nid"));
         String name=request.getParameter("name");
         Sclass sclass=new Sclass();
         sclass.setNid(nid);
         sclass.setNname(name);
         int count = sqlservice.addclass(sclass);
         if (count>0){
             request.getRequestDispatcher("Grade.jsp").forward(request,response);
         }else {
             request.getRequestDispatcher("add.jsp").forward(request,response);
         }
     }else
     if ("stu".equals(action))
     {
        //List<Student>list=sqlservice.setAll();
         List<Student> list = sqlservice.selectStudent();
         request.setAttribute("list",list);
         request.getRequestDispatcher("/Score.jsp").forward(request, response);


     }else {
         int sid = Integer.parseInt(request.getParameter("sid"));
         String sname = request.getParameter("sname");

         System.out.println(sid);
         System.out.println(sname);

         int login = sqlservice.Login(sid, sname);
         if (login > 0) {
             request.getRequestDispatcher("/index.jsp").forward(request, response);
         } else {
             request.getRequestDispatcher("login.jsp");
         }
     }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doPost(request,response);
    }
}
