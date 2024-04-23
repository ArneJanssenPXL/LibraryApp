package be.pxl.researchproject.api.controller;

import be.pxl.researchproject.api.request.AuthorRequest;
import be.pxl.researchproject.api.request.BookRequest;
import be.pxl.researchproject.api.response.AuthorDTO;
import be.pxl.researchproject.api.response.AuthorDetailDTO;
import be.pxl.researchproject.api.response.BookDTO;
import be.pxl.researchproject.api.response.BookDetailDTO;
import be.pxl.researchproject.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public List<BookDTO> getBooks() {
        return bookService.getBooks();
    }

    @GetMapping("/{bookId}")
    public BookDetailDTO getBookById(@PathVariable Long bookId) {
        return bookService.getBookById(bookId);
    }
}
