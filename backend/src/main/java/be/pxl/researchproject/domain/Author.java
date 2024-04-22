package be.pxl.researchproject.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    private int numberOfBooks;

    @ManyToMany(mappedBy = "authors")
    private List<Book> books = new ArrayList<>();

    public Author(){

    }

    public Author(String firstName, String lastName, int numberOfBooks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfBooks = numberOfBooks;
    }
}
