package cn.happy.jdbcTemplate.service;

import cn.happy.jdbcTemplate.entity.Book;

import java.util.List;

/**
 * Created by 王 on 2017/8/2.
 */
public interface IBookDaoService {
    public List<Book>finds();
}
