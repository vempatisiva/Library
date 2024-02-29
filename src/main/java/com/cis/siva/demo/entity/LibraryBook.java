package com.cis.siva.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table(name="book")
@Entity
@Data
public class LibraryBook {

    @Id
    private int bookId;
    private String title;
    private String authorName;
    private int yearPublished;
    private int quantity;

    @OneToMany(mappedBy = "libraryBook",cascade = CascadeType.ALL)
    private List<BookIsbn> bookIsbns;
}
// lombok