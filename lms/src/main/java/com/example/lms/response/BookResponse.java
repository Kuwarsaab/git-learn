package com.example.lms.response;

import lombok.Data;

@Data
public class BookResponse {
    private int id;
    private String title;
    private String author;
    private String isbn;
    private boolean available;
}