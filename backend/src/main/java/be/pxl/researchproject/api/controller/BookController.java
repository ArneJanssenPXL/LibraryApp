package be.pxl.researchproject.api.controller;

import be.pxl.researchproject.api.request.AuthorRequest;
import be.pxl.researchproject.api.request.BookRequest;
import be.pxl.researchproject.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;
    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public ResponseEntity<Long> createBook(@RequestBody BookRequest bookRequest) {
        return new ResponseEntity<>(bookService.createBook(bookRequest), HttpStatus.CREATED);
    }
}
