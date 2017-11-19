package cn.happy.spring21ssmxml.service;


import cn.happy.spring21ssmxml.entity.Book;
import cn.happy.spring21ssmxml.dao.IBookDAO;
import org.mybatis.spring.SqlSessionTemplate;

/**
 * Created by Happy on 2017-08-06.
 */
public class BookServiceImpl implements IBookService {
    //植入dao
    IBookDAO dao;

    public int addBook(Book book) {
        return dao.addBook(book);
    }

    public IBookDAO getDao() {
        return dao;
    }

    public void setDao(IBookDAO dao) {
        this.dao = dao;
    }
}
