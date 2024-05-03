<template>
    <v-app class="app">
      <div class="content-cards">
        <DetailBookComponent :book="book"></DetailBookComponent>
      </div>
      <div class="bottomNavigation">
        <BottomNavigation class="light-background"></BottomNavigation>
      </div>
    </v-app>
</template>

<script setup>
import { ref, onMounted } from 'vue';
import DetailBookComponent from '@/components/DetailBookComponent.vue';
import { useBookStore } from '@/stores/allBooks.js';
import { useRoute } from 'vue-router';
import BottomNavigation from "@/components/BottomNavigation.vue";

const bookStore = useBookStore();
const route = useRoute();
const book = ref(null);

onMounted(async () => {
  try {
    const bookId = route.params.id;
    book.value = await bookStore.detailBooks(bookId);
  } catch (error) {
    console.error('Er is een fout opgetreden bij het ophalen van de boekgegevens:', error);
  }
});
</script>

<style scoped>
</style>
