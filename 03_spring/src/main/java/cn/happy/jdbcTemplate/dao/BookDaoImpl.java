package cn.happy.jdbcTemplate.dao;

import cn.happy.jdbcTemplate.entity.Book;
import cn.happy.jdbcTemplate.service.BokDaoServiceImpl;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by 王 on 2017/8/2.
 */
public class BookDaoImpl extends JdbcDaoSupport implements IbookDao {


    public List<Book> findAll(){
        String sql="select * from book";
    List<Book>list=this.getJdbcTemplate().query(sql, new RowMapper<Book>() {
        public Book mapRow(ResultSet resultSet, int i) throws SQLException {
            Book book=new Book();
            book.setBookid(resultSet.getInt("bookid"));
            book.setBookname(resultSet.getString("bookname"));
            book.setBookprice(resultSet.getInt("bookprice"));
            return book;
        }
    });
        return list;
    }


}
