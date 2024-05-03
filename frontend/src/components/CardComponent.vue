<script setup>
import { defineProps } from 'vue';

defineProps({
  book: Object
});
</script>

<template class="background">
  <v-card
    class="mx-auto"
    id="book-card"
    elevation="5"
    rounded
    color="rgb(228 167 120)"
  >
    <v-card-text>
      <v-container>
        <v-row justify="space-between">
          <v-column>
            <h2 class='title'>{{ book.title }}</h2>
            <br/>
            <v-divider length="25vw"></v-divider>
            <br/>
            <div>
              <div>
                <p style="font-size: small"><strong>Total pages: </strong>{{ book.pages }}</p>
                <p style="font-size: small"><strong>Book blurb: </strong>{{ book.bookBlurb }}</p>
              </div>
            </div>
          </v-column>
        </v-row>
      </v-container>
    </v-card-text>
    <v-card-actions style="padding: 0; margin-left: 3vw">
      <v-btn  id="btn" variant="flat" :to="{ name: 'detailsBook', params: { id: book.id} }"> details</v-btn>
    </v-card-actions>
  </v-card>
</template>

<style scoped>
.background {
  background: #F6F1F1;
}

#book-card {
  background: #F6F1F1;
  border: 1px solid black;
  margin: 5vw;
  padding: 4px
}

.title {
  font-weight: bolder;
}
#btn{
  background-color:rgb(87 87 87);
  color: white;
}
</style>