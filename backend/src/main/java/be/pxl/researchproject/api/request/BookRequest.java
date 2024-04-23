package be.pxl.researchproject.api.request;

import be.pxl.researchproject.domain.Author;

public class BookRequest {
    private String title;
    private int pages;
    private String bookBlurb;
    private String isbn;
    private Author author;

    public BookRequest(String title, int pages, String bookBlurb, String isbn, Author author) {
        this.title = title;
        this.pages = pages;
        this.bookBlurb = bookBlurb;
        this.isbn = isbn;
        this.author = author;
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
