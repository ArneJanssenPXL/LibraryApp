<template>
    <v-card-text v-if="book" class='wrapper'>
      <h1 class="title">{{ book.title }}</h1>
      <h2 class='infoTopic'>Boek</h2>
      <hr>
      <h3><strong>Aantal pagina's:</strong> {{ book.pages }}</h3>
      <h3><strong>Boekenflap:</strong> {{ book.bookBlurb }}</h3>
      <h3><strong>ISBN:</strong> {{ book.isbn }}</h3>

      <h2 class='infoTopic'>Auteur</h2>
      <hr>
      <h3><strong>Voornaam:</strong> {{ book.author.firstName }}</h3>
      <h3><strong>Naam:</strong> {{ book.author.lastName }}</h3>
      <h3><strong>Aantal boeken:</strong> {{book.author.numberOfBooks}}</h3>
      <h3><strong>Uitgever:</strong> {{book.author.company}}</h3>
    </v-card-text>
</template>

<script setup>
import { defineProps } from 'vue';

defineProps({
  book: Object
});
</script>

<style scoped>
h3{
  margin-bottom: 3%;
}

.infoTopic{
  font-weight: bold;
  text-align: center;
}
.title {
  font-weight: bolder;
  margin-bottom: 20px;
  margin-top: 10px;
  text-align: center;
}

.wrapper {
  margin-top: 45px;
  margin-inline: auto;
  padding-top: 5px;
  padding-bottom: 5px;
  box-shadow: 0 8px 16px 5px rgba(0, 0, 0, 0.2);
  border-radius: 20px;
  background-color: rgb(228, 167, 120);
}
</style>
