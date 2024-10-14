package com.example.lms.manager;

import com.example.lms.dto.BookDTO;
import com.example.lms.entity.Book;
import com.example.lms.mapper.BookMapperImplementation;
import com.example.lms.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookManager {

    @Autowired
    private BookRepository repository;

    public BookDTO saveBook(BookDTO bookDTO) {
        Book book = BookMapperImplementation.fromDTO(bookDTO);
        Book savedEntity = repository.save(book);
        return BookMapperImplementation.toDTO(savedEntity);
    }

}