package cn.day22.service;

import cn.day22.dao.BookDao;
import cn.day22.entity.Book;

import java.util.List;

public class BookServiceImpl implements BookService{
    private BookDao bookDao;

    public BookDao getBookDao() {
        return bookDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public List <Book> findAllBooks() {
        return bookDao.findAllBooks();
    }

    @Override
    public int addBook(Book book) {
        return bookDao.addBook(book);
    }

    @Override
    public int delete(Integer id) {
        return bookDao.delete(id);
    }

    @Override
    public int update(Book book) {
        return bookDao.update(book);
    }
}
