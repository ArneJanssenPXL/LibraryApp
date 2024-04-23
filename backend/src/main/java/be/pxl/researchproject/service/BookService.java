package be.pxl.researchproject.service;

import be.pxl.researchproject.api.request.AuthorRequest;
import be.pxl.researchproject.api.request.BookRequest;
import be.pxl.researchproject.domain.Author;
import be.pxl.researchproject.domain.Book;
import be.pxl.researchproject.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Long createBook(BookRequest bookRequest) {
        Book bookToCreate = new Book(bookRequest.getTitle(), bookRequest.getPages(), bookRequest.getBookBlurb(), bookRequest.getIsbn(), bookRequest.getAuthor());
        Book savedBook = bookRepository.save(bookToCreate);
        return savedBook.getId();
    }
}
