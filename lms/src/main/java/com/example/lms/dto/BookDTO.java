package com.example.lms.dto;

import lombok.Data;

@Data
public class BookDTO {
    private int id;
    private String title;
    private String author;
    private String isbn;
    private boolean available;
}
