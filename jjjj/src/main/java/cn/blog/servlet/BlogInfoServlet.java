package cn.blog.servlet;

import cn.blog.dao.IBlogInfoDao;
import cn.blog.dao.iimpl.BlogInfoDaoImpl;
import cn.blog.entity.BlogInfo;
import cn.blog.entity.Page;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by 王 on 2017/7/2.
 */
@WebServlet(name = "BlogInfoServlet")
public class BlogInfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        IBlogInfoDao dao = new BlogInfoDaoImpl();
        String action = request.getParameter("action");
        //修改
        if ("updateList".equals(action)) {

            String blogids = request.getParameter("blogId");
            //int blogid=Integer.parseInt(request.getParameter("blogId"));

            String blogname = request.getParameter("blogName");
            System.out.println(blogname);
            String blogaddress = request.getParameter("blogAddress");
            BlogInfo info = new BlogInfo();
            info.setBlogId(Integer.parseInt(blogids));
            info.setBlogAuthor(blogname);
            info.setBlogAddress(blogaddress);
            try {
                boolean flag=dao.updateBlog(info);
                if (flag){
                    response.sendRedirect("BlogInfoServlet");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
           /* try {

                int updateblog = dao.updateBlog(info);
                if (updateblog > 0) {
                    response.sendRedirect("BlogInfoServlet");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }*/


        } else if ("add".equals(action)) {
            response.sendRedirect("/BlogHtTemplate-master/html/blog/addList.jsp");
        }//添加
        else if ("addList".equals(action)) {

            String blogName = request.getParameter("blogName");
            String blogAddress = request.getParameter("blogAddress");
            BlogInfo info = new BlogInfo();
            info.setBlogAuthor(blogName);
            info.setBlogAddress(blogAddress);
            System.out.print(info);
            try {
                int addblog = dao.addBlog(info);

                if (addblog > 0) {
                    response.sendRedirect("BlogInfoServlet");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if ("deleteblog".equals(action)) {
            String id = request.getParameter("blogId");
            try {
                int count = dao.delBlog(Integer.parseInt(id));
                if (count > 0) {
                    //request.getRequestDispatcher("/BlogInfoServlet").forward(request,response);
                    response.sendRedirect("BlogInfoServlet");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if ("updateblog".equals(action)) {
            System.out.print(".............");
            String id = request.getParameter("blogId");

            try {
                List<BlogInfo> blogList = dao.getAl(Integer.parseInt(id));
                request.setAttribute("blogList", blogList);
                request.getRequestDispatcher("/BlogHtTemplate-master/html/blog/updateblog.jsp").forward(request, response);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            Page page=new Page();
            //每页显示的记录数
            int pageSize=3;
            page.setPageSize(pageSize);
            System.out.println(pageSize);
            //当前页数
            int MyIndex=1;
            String pageIndex=request.getParameter("pageIndex");
            System.out.println(pageIndex);
            if (pageIndex!=null){
                MyIndex=Integer.parseInt(pageIndex);
            }else{
                MyIndex=1;
            }

            page.setPageIndex(MyIndex);
            //计算总页数
            int totapages;
            try {
                int count = dao.getcount();
                if (count%pageSize==0){
                    totapages=count/pageSize;
                }else{
                    totapages=count/pageSize+1;
                }
                page.setTotapages(totapages);
            } catch (Exception e) {
                e.printStackTrace();
            }
            //装载集合
           /* try {
                List<BlogInfo> list = dao.getAlls(page.getPageIndex(), page.getPageSize());
                page.setBloglist(list);
                request.setAttribute("page",page);

                request.getRequestDispatcher("/BlogHtTemplate-master/html/blog/datalist.jsp").forward(request,response);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }*/
            try {
                List<BlogInfo> blogList = dao.getAlls(page.getPageIndex(),page.getPageSize());
                page.setBloglist(blogList);
                request.setAttribute("page", page);
                request.getRequestDispatcher("/BlogHtTemplate-master/html/blog/datalist.jsp").forward(request, response);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      doPost(request,response);
    }
}
