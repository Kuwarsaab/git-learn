package com.example.lms.controller;

import com.example.lms.mapper.BookMapperImplementation;
import com.example.lms.request.BookRequest;
import com.example.lms.response.BookResponse;
import com.example.lms.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/books")
public class BookController {

    @Autowired
    private BookService service;

    @PostMapping
    public BookResponse addBook(@RequestBody BookRequest request) {
//        return null;
        return service.addBook(BookMapperImplementation.toDTO(request));
    }
}