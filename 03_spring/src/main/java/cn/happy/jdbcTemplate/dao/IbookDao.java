package cn.happy.jdbcTemplate.dao;



import cn.happy.jdbcTemplate.entity.Book;

import java.util.List;

/**
 * Created by 王 on 2017/8/2.
 */
public interface IbookDao {
    public List<Book>findAll();
}
