package com.foogaro.resteasy.service;

import com.foogaro.resteasy.manager.LibraryManager;
import com.foogaro.resteasy.model.Result;
import com.foogaro.resteasy.model.dto.LibraryRequest;
import com.foogaro.resteasy.model.dto.LibraryResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author l.fugaro@gmail.com
 */
public class LibraryServiceImpl implements LibraryService {

    protected final Logger logger = LoggerFactory.getLogger(getClass().getName());

    private LibraryManager libraryManager = new LibraryManager();

    public Result getAllBooks() {
        logger.info("Getting all books from the library");
        Result result = new Result();

        LibraryResponse libraryResponse = new LibraryResponse();
        libraryResponse.setBooks(libraryManager.getAll());
        result.setData(libraryResponse);
        result.setCode("OK");

        logger.debug("Returning all books from the library: {}", result);
        return result;
    }

    public Result findByBook(LibraryRequest libraryRequest) {
        logger.info("Getting all books from the library");
        logger.debug("libraryRequest: {}", libraryRequest);

        Result result = new Result();

        LibraryResponse libraryResponse = new LibraryResponse();
        libraryResponse.setBooks(libraryManager.findByBook(libraryRequest.getBook()));
        result.setData(libraryResponse);
        result.setCode("OK");

        logger.debug("Returning all books from the library: {}", result);
        return result;
    }

    public Result findByAuthor(LibraryRequest libraryRequest) {
        logger.info("Getting all books from the library");
        logger.debug("libraryRequest: {}", libraryRequest);

        Result result = new Result();

        LibraryResponse libraryResponse = new LibraryResponse();
        libraryResponse.setBooks(libraryManager.findByAuthor(libraryRequest.getAuthor()));
        result.setData(libraryResponse);
        result.setCode("OK");

        logger.debug("Returning all books from the library: {}", result);
        return result;
    }
}
