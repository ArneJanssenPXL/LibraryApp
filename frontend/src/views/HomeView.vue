<script setup>
import {onMounted} from "vue";
import {useBookStore} from "@/stores/allBooks.js";
import CardComponent from "@/components/CardComponent.vue";
import BottomNavigation from "@/components/BottomNavigation.vue";

const bookStore = useBookStore();

onMounted(async () => {
  await bookStore.fetchBooks();
});
</script>

<template>
  <v-app>
    <div class="content-cards">
      <ul>
        <li v-for="book in bookStore.books" :key="book.title">
          <card-component :book="book"></card-component>
        </li>
      </ul>
    </div>
    <div class="bottomNavigation">
      <BottomNavigation class="light-background"></BottomNavigation>
    </div>
  </v-app>
</template>

<style scoped>
body {
  background: #f6f1f1;
  justify-content: center;
}

li {
  margin: 2%;
  list-style-type: none;
  background: #f6f1f1;
  align-items: center;
}

.content-cards {
  background: #f6f1f1;
  padding-bottom: 64px;
  height: 100%;
  z-index: 0;
}

.bottomNavigation {
  z-index: 1;
}

.light-background {
  background: #f6f1f1;
}

</style>

