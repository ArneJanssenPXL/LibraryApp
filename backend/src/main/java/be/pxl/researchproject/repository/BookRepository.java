package be.pxl.researchproject.repository;

import be.pxl.researchproject.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
