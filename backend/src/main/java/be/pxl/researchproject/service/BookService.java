package be.pxl.researchproject.service;

import be.pxl.researchproject.api.request.BookRequest;
import be.pxl.researchproject.api.response.BookDTO;
import be.pxl.researchproject.api.response.BookDetailDTO;
import be.pxl.researchproject.domain.Book;
import be.pxl.researchproject.exceptions.InvalidBookException;
import be.pxl.researchproject.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<BookDTO> getBooks() {
        return bookRepository.findAll().stream()
                .map(b -> new BookDTO(b.getId(), b.getTitle(), b.getPages(), b.getBookBlurb()))
                .toList();
    }

    public BookDetailDTO getBookById(Long bookId){
        return bookRepository.findById(bookId)
                .map(book -> new BookDetailDTO(book.getTitle(), book.getPages(), book.getBookBlurb(), book.getIsbn(), book.getAuthor()))
                .orElseThrow(() -> new
                        InvalidBookException(String.format("BookId: %d is invalid", bookId)));
    }
}
