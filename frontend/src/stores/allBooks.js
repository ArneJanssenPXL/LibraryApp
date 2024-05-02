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

        /*const additionalResponse = await fetch('http://localhost:8081/foals');
        if (!additionalResponse.ok) {
          let status = additionalResponse.status;
          throw new Error(`error status code ${status}`);
        }
        const additionalHorses = await additionalResponse.json();
        this.horses = [...this.horses, ...additionalHorses.map(horse => ({
          ...horse,
          isMerry: false,
          img: null
        }))];*/
      } catch (error) {
        this.error = error.message;
      }
    }
  }
});