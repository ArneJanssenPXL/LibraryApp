package be.pxl.researchproject.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

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

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "book_id")
    private Author author;

    public Book(){

    }

    public Book(String title, int pages, String bookBlurb, String isbn, Author author) {
        this.title = title;
        this.pages = pages;
        this.bookBlurb = bookBlurb;
        this.isbn = isbn;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public String getBookBlurb() {
        return bookBlurb;
    }

    public String getIsbn() {
        return isbn;
    }

    public Author getAuthor() {
        return author;
    }
}
