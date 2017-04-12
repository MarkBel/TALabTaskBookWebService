package com.epam.service;

import com.epam.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by Mark_Rudak on 4/12/2017.
 */
public class BookService {

    private final static Logger logger = Logger.getLogger(BookService.class.getName());

    static List<Book> bookArrayList = getBookList();

    public BookService() {
        bookArrayList = new ArrayList<>();
        Book bookIdiot = new Book(1, "Idiot", "Dostoevsky", "drama", 1869, 700);
        Book bookFinancier = new Book(2, "Financier", "Theodore Dreiser", "novel", 1912, 750);
        bookArrayList.add(bookIdiot);
        bookArrayList.add(bookFinancier);
    }

    /**
     * Get all list of book
     *
     * @return List of book
     */
    public List<Book> getAllBooks() {
        return bookArrayList;
    }

    /**
     * Get one book
     *
     * @param id
     * @return One book
     */
    public Book getBookById(int id) {
        return bookArrayList.get(id);
    }

    public static List<Book> getBookList() {
        return bookArrayList;
    }
}
