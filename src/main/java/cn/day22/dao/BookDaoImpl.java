package cn.day22.dao;

import cn.day22.entity.Book;
import cn.day22.util.MyRowMap;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

public class BookDaoImpl extends JdbcDaoSupport implements BookDao{
    @Override
    public List<Book> findAllBooks() {
        String sql = "select * from book";
        List <Book> list = this.getJdbcTemplate().query(sql, new MyRowMap() {
        });
        return list;
    }

    @Override
    public int addBook(Book book) {
        String sql = "insert into book (bookname,bookprice) values (?,?)";
        int i = this.getJdbcTemplate().update(sql, new Object[]{book.getBookname(), book.getBookprice()});
        return i;
    }

    @Override
    public int delete(Integer id) {
        String sql = "delete from book where bookid=? ";
        int i = this.getJdbcTemplate().update(sql,id);
        return i;
    }

    @Override
    public int update(Book book) {
        String sql = "update book set bookname=?,bookprice=? where bookid=?";
        int i = this.getJdbcTemplate().update(sql,new Object[]{book.getBookname(),book.getBookprice(),book.getBookid()});
        // update(sql,book.getBookname(),book.getBookprice(),book.getBookid()) 可变数组
        return i;
    }
}
