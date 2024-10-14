package com.example.lms.service;

import com.example.lms.dto.BookDTO;
import com.example.lms.manager.BookManager;
import com.example.lms.mapper.BookMapperImplementation;
import com.example.lms.response.BookResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookManager bookManager;

    public BookResponse addBook(BookDTO bookDTO) {
//        return null;
        return BookMapperImplementation.toResponse(bookManager.saveBook(bookDTO));
    }
}