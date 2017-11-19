package cn.blog.dao;

import cn.blog.entity.BlogInfo;

import java.util.List;

/**
 * Created by 王 on 2017/7/2.
 */
public interface IBlogInfoDao  {
    public List<BlogInfo> getAll() throws Exception;
    public int delBlog(int id)throws Exception;

    //添加
    public int addBlog(BlogInfo blog) throws Exception;
    //修改
    public boolean updateBlog(BlogInfo info) throws Exception;
    //查


    public List<BlogInfo> getAl(int id) throws Exception;
    public int getcount() throws Exception;
    public List<BlogInfo> getAlls(int pageIndex, int pageSize) throws Exception;
}
