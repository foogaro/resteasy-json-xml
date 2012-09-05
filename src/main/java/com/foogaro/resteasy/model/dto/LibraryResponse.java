package com.foogaro.resteasy.model.dto;

import com.foogaro.resteasy.model.Book;
import com.foogaro.resteasy.model.DataWrapper;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author l.fugaro@gmail.com
 */
@XmlRootElement
public class LibraryResponse extends DataWrapper {

    private List<Book> books;

    @XmlElementWrapper(name = "books")
    @XmlElement(name = "book")
    public List<Book> getBooks() {
        return books;
    }

    @Deprecated
    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Book> addBook(Book book) {
        if (books == null) books = new ArrayList<Book>();
        if (book != null) books.add(book);
        return books;
    }

    @Override
    public String toString() {
        return "LibraryResponse{" +
                "books=" + books +
                '}';
    }
}
