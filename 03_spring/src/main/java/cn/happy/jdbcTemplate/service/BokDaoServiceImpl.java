package cn.happy.jdbcTemplate.service;

import cn.happy.jdbcTemplate.dao.IbookDao;
import cn.happy.jdbcTemplate.entity.Book;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * Created by 王 on 2017/8/2.
 */
public class BokDaoServiceImpl implements IBookDaoService {
    private IbookDao dao;

    public IbookDao getDao() {
        return dao;
    }

    public void setDao(IbookDao dao) {
        this.dao = dao;
    }

    public List<Book> finds() {

        return dao.findAll();
    }
}
