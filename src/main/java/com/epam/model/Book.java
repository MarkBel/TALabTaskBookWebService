package com.epam.model;

/**
 * Created by Mark_Rudak on 4/12/2017.
 */
public class Book {


    private int id;
    private String bookName;
    private String author;
    private String bookType;
    private int year;
    private int pageCount;

    public Book() {
        super();
    }

    public Book(int id, String bookName, String author, String bookType, int year, int pageCount) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.bookType = bookType;
        this.year = year;
        this.pageCount = pageCount;
    }

    public int getId() {
        return id;
    }

    public void setBookId(int bookId) {
        this.id = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (id != book.id) return false;
        if (year != book.year) return false;
        if (pageCount != book.pageCount) return false;
        if (bookName != null ? !bookName.equals(book.bookName) : book.bookName != null) return false;
        if (author != null ? !author.equals(book.author) : book.author != null) return false;
        return bookType != null ? bookType.equals(book.bookType) : book.bookType == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (bookName != null ? bookName.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (bookType != null ? bookType.hashCode() : 0);
        result = 31 * result + year;
        result = 31 * result + pageCount;
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", bookType='" + bookType + '\'' +
                ", year=" + year +
                ", pageCount=" + pageCount +
                '}';
    }
}
