<template>
    <v-card-text v-if="book">
      <h2 class="title">Title: {{ book.title }}</h2>
      <h3><strong>Total pages:</strong> {{ book.pages }}</h3>
      <h3><strong>Book blurb:</strong> {{ book.bookBlurb }}</h3>
      <h3><strong>ISBN:</strong> {{ book.isbn }}</h3>
      <h3><strong>Author:</strong> {{ book.author.firstName }} {{ book.author.lastName }}</h3>
    </v-card-text>
</template>

<script setup>
import { defineProps } from 'vue';

defineProps({
  book: Object
});
</script>

<style scoped>
.detail-card {
  max-width: 600px;
  margin: auto;
  margin-top: 20px;
  padding: 20px;
}
h3{
  margin-bottom: 5%;
}
.title {
  font-weight: bolder;
  margin-bottom: 50px;
}
</style>
