package cn.day22.entity;

public class Book {
    private Integer bookid;
    private String bookname;
    private Integer bookprice;

    public Book() {
    }

    public Book(String bookname, Integer bookprice) {
        this.bookname = bookname;
        this.bookprice = bookprice;
    }

    public Book(Integer bookid, String bookname, Integer bookprice) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.bookprice = bookprice;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public Integer getBookprice() {
        return bookprice;
    }

    public void setBookprice(Integer bookprice) {
        this.bookprice = bookprice;
    }
}
