package cn.day22.service;

import cn.day22.entity.Book;

import java.util.List;

public interface BookService {
    public List<Book> findAllBooks();
    public int addBook(Book book);
    public int delete(Integer id);
    public int update(Book book);
}
