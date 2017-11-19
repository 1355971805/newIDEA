package cn.happy.spring21ssmxml.servlct;

import cn.happy.spring21ssmxml.entity.Book;
import cn.happy.spring21ssmxml.service.IBookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 王 on 2017/8/7.
 */

public class BookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     request.setCharacterEncoding("utf-8");


     String name=request.getParameter("bookName");
     //String price=request.getParameter("bookPrice");
     int p=Integer.parseInt(request.getParameter("bookPrice"));
        WebApplicationContext wac = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        //ApplicationContext wac = new ClassPathXmlApplicationContext("applicationContextspring19ssm.xml");
        IBookService pp =(IBookService) wac.getBean("sqlservice");
        Book book=new Book();
        book.setBookName(name);
        book.setBookPrice(p);
       int count= pp.addBook(book);
       if (count>0){
          // response.sendRedirect("/index.jsp");
           request.getRequestDispatcher("/index.jsp").forward(request,response);
       }else {
           request.getRequestDispatcher("/1.jsp").forward(request,response);

       }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doPost(request,response);
    }
}
