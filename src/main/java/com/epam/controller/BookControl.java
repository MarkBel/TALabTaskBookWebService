package com.epam.controller;

import com.epam.model.Book;
import com.epam.service.BookService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Mark_Rudak on 4/12/2017.
 */

@Path("/books")
public class BookControl {

    BookService bookService = new BookService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getAllBooks()
    {
        return  bookService.getAllBooks();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Book getBookById(@PathParam("id") int id) {
        return bookService.getBookById(id);
    }
}
