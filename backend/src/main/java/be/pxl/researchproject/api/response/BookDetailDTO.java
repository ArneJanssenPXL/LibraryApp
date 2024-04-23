package be.pxl.researchproject.api.response;

import be.pxl.researchproject.domain.Author;

public record BookDetailDTO(String title, int pages, String bookBlurb, String isbn, Author author) {
}
