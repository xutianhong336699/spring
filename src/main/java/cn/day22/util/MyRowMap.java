package cn.day22.util;

import cn.day22.entity.Book;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MyRowMap implements RowMapper {
    @Override
    public Book mapRow(ResultSet rs, int index) throws SQLException {
        Book book = new Book();
        book.setBookid(rs.getInt("bookid"));
        book.setBookname(rs.getString("bookname"));
        book.setBookprice(rs.getInt("bookprice"));
        return book;
    }
}
