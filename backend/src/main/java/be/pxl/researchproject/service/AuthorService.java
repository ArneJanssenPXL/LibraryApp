package be.pxl.researchproject.service;

import be.pxl.researchproject.api.request.AuthorRequest;
import be.pxl.researchproject.api.response.AuthorDTO;
import be.pxl.researchproject.api.response.AuthorDetailDTO;
import be.pxl.researchproject.domain.Author;
import be.pxl.researchproject.exceptions.InvalidAuthorException;
import be.pxl.researchproject.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }

    public Long createAuthor(AuthorRequest authorRequest) {
        Author authorToCreate = new Author(authorRequest.getFirstName(), authorRequest.getLastName(), authorRequest.getNumberOfBooks(), authorRequest.getCompany());
        Author savedAuthor = authorRepository.save(authorToCreate);
        return savedAuthor.getId();
    }

    public List<AuthorDTO> getAuthors() {
        return authorRepository.findAll().stream()
                .map(a -> new AuthorDTO(a.getId(), a.getFirstName(), a.getLastName()))
                .toList();
    }

    public AuthorDetailDTO getAuthorById(Long authorId){
        return authorRepository.findById(authorId)
                .map(author -> new AuthorDetailDTO(author.getFirstName(), author.getLastName(), author.getNumberOfBooks(), author.getCompany()))
                .orElseThrow(() -> new
                        InvalidAuthorException(String.format("AuthorId: %d is invalid", authorId)));
    }
}
