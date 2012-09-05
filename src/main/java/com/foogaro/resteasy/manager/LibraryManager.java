package com.foogaro.resteasy.manager;

import com.foogaro.resteasy.model.Author;
import com.foogaro.resteasy.model.Book;
import com.foogaro.resteasy.model.FormatType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author l.fugaro@gmail.com
 */
public class LibraryManager {

    protected final Logger logger = LoggerFactory.getLogger(getClass().getName());

    public List<Book> getAll() {

        logger.info("Getting all books from the library");
        List<Book> books = new ArrayList<Book>();

        Book book = null;
        List<Author> authors = null;

        book = new Book();
        book.setFormat(FormatType.PDF);
        book.setISBN("999-1234567890");
        book.setTitle("The Adventures of Tom Sawyer");
        book.setYear(1876);
        authors = new ArrayList<Author>();
        authors.add(new Author("Mark", "Twain"));
        book.setAuthors(authors);
        books.add(book);
        logger.debug("book: {}", book);

        book = new Book();
        book.setFormat(FormatType.MOBI);
        book.setISBN("999-1234567891");
        book.setTitle("Adventures of Huckleberry Finn");
        book.setYear(1884);
        authors = new ArrayList<Author>();
        authors.add(new Author("Mark", "Twain"));
        book.setAuthors(authors);
        books.add(book);
        logger.debug("book: {}", book);

        book = new Book();
        book.setFormat(FormatType.PAPAER);
        book.setISBN("999-1234567892");
        book.setTitle("SCJP Sun Certified Programmer for Java 6 Exam 310-065");
        book.setYear(1884);
        authors = new ArrayList<Author>();
        authors.add(new Author("Bert", "Bates"));
        authors.add(new Author("Katherine", "Sierra"));
        book.setAuthors(authors);
        books.add(book);
        logger.debug("book: {}", book);

        logger.debug("Returning all books from the library: {}", books);
        return books;
    }

    public List<Book> findByBook(Book book) {

        logger.info("Looking for books by book from the library");
        List<Book> books = new ArrayList<Book>();

        List<Author> authors = null;

        authors = new ArrayList<Author>();
        authors.add(new Author("Jhon", "Jack"));
        book.setAuthors(authors);
        books.add(book);
        logger.debug("book: {}", book);

        logger.debug("Returning all books found by book from the library: {}", books);
        return books;
    }

    public List<Book> findByAuthor(Author author) {

        logger.info("Looking for books by author from the library");
        List<Book> books = new ArrayList<Book>();

        Book book = null;
        List<Author> authors = null;

        book = new Book();
        book.setFormat(FormatType.PDF);
        book.setISBN("999-1234567890");
        book.setTitle("My first book");
        book.setYear(2012);
        authors = new ArrayList<Author>();
        authors.add(author);
        book.setAuthors(authors);
        books.add(book);
        logger.debug("book: {}", book);

        book = new Book();
        book.setFormat(FormatType.MOBI);
        book.setISBN("999-1234567891");
        book.setTitle("My second book");
        book.setYear(2012);
        authors = new ArrayList<Author>();
        authors.add(author);
        book.setAuthors(authors);
        books.add(book);
        logger.debug("book: {}", book);

        logger.debug("Returning all books found by author from the library: {}", books);
        return books;
    }
}
