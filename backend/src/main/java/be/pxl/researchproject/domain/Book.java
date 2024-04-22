package be.pxl.researchproject.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String title;
    @Min(value = 1, message = "Must be greater than 1")
    private int pages;
    @Column(length = 512)
    private String bookBlurb; // Small text on the back page of the book
    private String isbn;
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "author_book", joinColumns = {@JoinColumn(name = "book_id")}, inverseJoinColumns = {@JoinColumn(name = "author_id")})
    private List<Author> authors = new ArrayList<>();

    public Book(){

    }

    public Book(String title, int pages, String bookBlurb, String isbn) {
        this.title = title;
        this.pages = pages;
        this.bookBlurb = bookBlurb;
        this.isbn = isbn;
    }
}
