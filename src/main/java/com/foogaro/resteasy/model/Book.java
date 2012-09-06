package com.foogaro.resteasy.model;

import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * @author l.fugaro@gmail.com
 */

@XmlRootElement(name = "book")
public class Book implements Serializable {

    @FormParam("title")
    private String title;

    private List<Author> authors;

    @FormParam("ISBN")
    private String ISBN;
    @FormParam("year")
    private int year;
    @FormParam("format")
    private FormatType format;

    public Book() {
    }

    @XmlElement
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @XmlElementWrapper(name = "authors")
    @XmlElement(name = "author")
    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @XmlElement
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @XmlElement
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @XmlElement(name = "format")
    public FormatType getFormat() {
        return format;
    }

    public void setFormat(FormatType format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors=" + authors +
                ", ISBN='" + ISBN + '\'' +
                ", year=" + year +
                ", format=" + format +
                '}';
    }

}
