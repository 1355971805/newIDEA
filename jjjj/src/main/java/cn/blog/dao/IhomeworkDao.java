package cn.blog.dao;

import cn.blog.entity.homework;

import java.util.List;

/**
 * Created by 王 on 2017/7/7.
 */
public interface IhomeworkDao {
    public boolean addList(homework work)throws Exception;
    public List<homework>getHome()throws Exception;

}
