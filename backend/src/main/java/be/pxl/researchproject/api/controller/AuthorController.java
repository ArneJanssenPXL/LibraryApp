package be.pxl.researchproject.api.controller;

import be.pxl.researchproject.api.request.AuthorRequest;
import be.pxl.researchproject.api.response.AuthorDTO;
import be.pxl.researchproject.api.response.AuthorDetailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import be.pxl.researchproject.service.AuthorService;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping
    public ResponseEntity<Long> createAuthor(@RequestBody AuthorRequest authorRequest) {
        return new ResponseEntity<>(authorService.createAuthor(authorRequest), HttpStatus.CREATED);
    }

    @GetMapping
    public List<AuthorDTO> getAuthors() {
        return authorService.getAuthors();
    }

    @GetMapping("/{authorId}")
    public AuthorDetailDTO getAuthorById(@PathVariable Long authorId) {
        return authorService.getAuthorById(authorId);
    }
}
