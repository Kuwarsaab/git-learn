
package com.example.lms.mapper;

import com.example.lms.dto.BookDTO;
import com.example.lms.entity.Book;
import com.example.lms.request.BookRequest;
import com.example.lms.response.BookResponse;

public class BookMapperImplementation {
    public static BookDTO toDTO(Book book) {
        if (book == null) return null;

        BookDTO dto = new BookDTO();
        dto.setId(book.getId());
        dto.setTitle(book.getTitle());
        dto.setAuthor(book.getAuthor());
        dto.setIsbn(book.getIsbn());
        dto.setAvailable(book.isAvailable());

        return dto;
    }

    public static Book fromDTO(BookDTO dto) {
        if (dto == null) return null;

        Book book = new Book();
        book.setId(dto.getId());
        book.setTitle(dto.getTitle());
        book.setAuthor(dto.getAuthor());
        book.setIsbn(dto.getIsbn());
        book.setAvailable(dto.isAvailable());
        return book;
    }

    public static BookDTO toDTO(BookRequest request) {
        if (request == null)    return null;

        BookDTO bookDTO = new BookDTO();
        bookDTO.setTitle(request.getTitle());
        bookDTO.setAuthor(request.getAuthor());
        bookDTO.setIsbn(request.getIsbn());
        bookDTO.setAvailable(true);  // Set available by default
        return bookDTO;
    }

    public static BookResponse toResponse(BookDTO dto) {
        if (dto == null ) return null;

        BookResponse response = new BookResponse();
        response.setId(dto.getId());
        response.setTitle(dto.getTitle());
        response.setAuthor(dto.getAuthor());
        response.setIsbn(dto.getIsbn());
        response.setAvailable(dto.isAvailable());
        return response;
    }
}
