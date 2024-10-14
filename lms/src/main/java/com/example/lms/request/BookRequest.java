package com.example.lms.request;

import lombok.Data;

@Data
public class BookRequest {
    private int id;
    private String title;
    private String author;
    private String isbn;
    private boolean available;
}