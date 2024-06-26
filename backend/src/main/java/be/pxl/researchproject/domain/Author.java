package be.pxl.researchproject.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

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

    private String company;

    public Author(){

    }

    public Author(String firstName, String lastName, int numberOfBooks, String company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfBooks = numberOfBooks;
        this.company = company;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public String getCompany() {
        return company;
    }
}
