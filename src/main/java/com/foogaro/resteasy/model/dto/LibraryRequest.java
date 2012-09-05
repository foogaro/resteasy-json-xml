package com.foogaro.resteasy.model.dto;

import com.foogaro.resteasy.model.Author;
import com.foogaro.resteasy.model.Book;
import org.jboss.resteasy.annotations.Form;

import java.io.Serializable;

/**
 * @author l.fugaro@gmail.com
 */
public class LibraryRequest implements Serializable {

    @Form
    private Book book;
    @Form
    private Author author;

    public LibraryRequest() {
    }

    public LibraryRequest(Book book, Author author) {
        this.book = book;
        this.author = author;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "LibraryRequest{" +
                "book=" + book +
                ", author=" + author +
                '}';
    }

}
