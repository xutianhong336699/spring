package cn.day24ssm.service;

import cn.day24ssm.dao.BookDao;
import cn.day24ssm.entity.Book;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    @Override
    public int addBook(Book book) {
        return bookDao.addBook(book);
    }

    public BookDao getBookDao() {
        return bookDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
