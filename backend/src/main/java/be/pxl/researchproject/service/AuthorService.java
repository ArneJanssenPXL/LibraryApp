package be.pxl.researchproject.service;

import be.pxl.researchproject.api.request.AuthorRequest;
import be.pxl.researchproject.api.response.AuthorDTO;
import be.pxl.researchproject.domain.Author;
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
                .map(a -> new AuthorDTO(a.getFirstName(), a.getLastName(), a.getNumberOfBooks(), a.getCompany()))
                .toList();
    }
}
