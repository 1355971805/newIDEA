package cn.blog.dao.iimpl;

import cn.blog.dao.BaseDao;
import cn.blog.dao.IBlogInfoDao;
import cn.blog.entity.BlogInfo;
import org.junit.Test;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 王 on 2017/7/2.
 */


public class BlogInfoDaoImpl extends BaseDao implements IBlogInfoDao {
    @Test
    public void gets() throws Exception {
        List<BlogInfo> flag=getAll();
        for (BlogInfo admins : flag) {
            System.out.print(admins.getBlogAuthor());
        }


    }
    public List<BlogInfo> getAll() throws Exception {
        List<BlogInfo>list=new ArrayList<BlogInfo>();
        String sql="select * from bloginfo where BlogDel=0";
        ResultSet rs=executeQuery(sql);
        while (rs.next()){
            BlogInfo info=new BlogInfo();
            info.setBlogId(rs.getInt("blogId"));
            info.setBlogAuthor(rs.getString("blogAuthor"));
            info.setBlogAddress(rs.getString("blogAddress"));
            info.setBlogDel(rs.getBoolean("blogDel"));
            list.add(info);
        }
        return list;
    }
     //删除
    public int delBlog(int id)throws Exception {

        String sql = "delete from bloginfo where BlogId=?";

        int count = executeUpdate(sql, id);



        return count;
    }
    //添加

    //添加
    @Test public  void  add() throws Exception {
        BlogInfo info=new BlogInfo();

        info.setBlogAuthor("we");
        info.setBlogAddress("dds");

        addBlog(info);
    }



    public int addBlog(BlogInfo blog) throws Exception {
        String sql="INSERT INTO bloginfo(BlogAuthor,BlogAddress)VALUES(?,?);";
        Object [] obj={blog.getBlogAuthor(),blog.getBlogAddress()};
        int count =executeUpdate(sql,obj);
        closeAll();
        return count;

    }

    //修改
    public boolean updateBlog(BlogInfo info) throws Exception {
        boolean flag=false;
        String sql="update bloginfo set BlogAuthor=?,BlogAddress=? where BlogId=?";
        Object [] obj={info.getBlogAuthor(),info.getBlogAddress(),info.getBlogId()};
        int count = executeUpdate(sql, obj);
        if (count>0){
            flag=true;
        }
        closeAll();
        return flag;
    }
    //查
    public BlogInfo getAdminInfo(int id) throws Exception{

        String sql="SELECT * FROM bloginfo WHERE BlogId=?";

        ResultSet rs=executeQuery(sql,id);
        BlogInfo info=new BlogInfo();
        while(rs.next()){
            info.setBlogId(rs.getInt("blogId"));
            info.setBlogAuthor(rs.getString("blogAuthor"));
            info.setBlogAddress(rs.getString("blogAddress"));

        }
        closeAll();
        return info;

    }
    @Test
    public void ge() throws Exception {
        List<BlogInfo> flag=getAl(5);
        for (BlogInfo admins : flag) {
            System.out.print(admins.getBlogAuthor());
        }


    }
    public List<BlogInfo> getAl(int id) throws Exception {
        List<BlogInfo>list=new ArrayList<BlogInfo>();
        String sql="select * from bloginfo where BlogId='"+id+"'";
        ResultSet rs=executeQuery(sql);
        while (rs.next()){
            BlogInfo info=new BlogInfo();
            info.setBlogId(rs.getInt("blogId"));
            info.setBlogAuthor(rs.getString("blogAuthor"));
            info.setBlogAddress(rs.getString("blogAddress"));


            list.add(info);
        }
        closeAll();
        return list;
    }
    @Test
    public void getss() throws Exception {
        List<BlogInfo> flag=getAlls(3,5);
        for (BlogInfo admins : flag) {
            System.out.print(admins.getBlogAuthor());
        }


    }
    public List<BlogInfo> getAlls(int pageIndex, int pageSize) throws Exception {
        List<BlogInfo> list = new ArrayList<BlogInfo>();
        String sql = "select * from bloginfo limit ?,?";
        Object[] obj = {(pageIndex - 1) * pageSize, pageSize};
        rs=executeQuery(sql,obj);
        if (rs != null) {
            while (rs.next()) {
                BlogInfo info = new BlogInfo();
                info.setBlogId(rs.getInt("blogId"));
                info.setBlogAuthor(rs.getString("blogAuthor"));
                info.setBlogAddress(rs.getString("blogAddress"));
                info.setBlogDel(rs.getBoolean("blogDel"));
                list.add(info);
            }
        }
        closeAll();
        return list;
    }
    public int getcount() throws Exception {
        int result=0;
        String sql="select count(*) as num from bloginfo";
        rs = executeQuery(sql);
        if (rs!=null){
            if (rs.next()){
                result=rs.getInt("num");
            }
        }
        closeAll();
        return result;
    }


}