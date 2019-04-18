package cn.day22.dao;

import cn.day22.entity.Book;

import java.util.List;

public interface BookDao {
    public List<Book> findAllBooks();
    public int addBook(Book book);
    public int delete(Integer id);
    public int update(Book book);
}
