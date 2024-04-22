package be.pxl.researchproject.repository;

import be.pxl.researchproject.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
