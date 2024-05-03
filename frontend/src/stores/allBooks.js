import {defineStore} from 'pinia';

export const useBookStore = defineStore('books', {
  state: () => ({
    books: [],
    error: ''
  }),
  getters: {
    numberOfBooks: (state) => state.books.length
  },
  actions: {
    async fetchBooks() {
      try {
        const response = await fetch('http://localhost:8085/books');
        if (!response.ok) {
          let status = response.status;
          throw new Error(`error status code ${status}`);
        }
        const fetchedBooks = await response.json();
        this.books = fetchedBooks.map(books => ({
          ...books,
        }));
      } catch (error) {
        this.error = error.message;
      }
    },
    async detailBooks(bookId) {
      try {
        const response = await fetch(`http://localhost:8085/books/${bookId}`);
        if (!response.ok) {
          let status = response.status;
          throw new Error(`error status code ${status}`);
        }
        const fetchedBook = await response.json();
        return fetchedBook; // Return the fetched book
      } catch (error) {
        this.error = error.message;
        return null; // Return null in case of error
      }
    }
  }
});