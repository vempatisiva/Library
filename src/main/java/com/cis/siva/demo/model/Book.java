package com.cis.siva.demo.model;

import lombok.Data;

import java.util.List;

@Data
public class Book {

    private Integer bookId;
    private String title;
    private String authorName;
    private Integer yearPublished;
    private Integer quantity;
    private List<BookIsbnDTO> bookIsbns;
}