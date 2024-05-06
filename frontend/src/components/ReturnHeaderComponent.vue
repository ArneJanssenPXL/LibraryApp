<script setup>
defineProps({
  titel: String
});
const goBack = () => {
  window.history.back();
};
</script>

<template>
  <v-app>
    <v-container>
      <v-app-bar color="rgb(158, 158, 158)">
        <v-btn @click="goBack" variant="text"><v-icon size="x-large" style="color: white">mdi-arrow-left</v-icon></v-btn>
        <v-app-bar-title style="color: white">{{ titel }}</v-app-bar-title>
      </v-app-bar>
    </v-container>
  </v-app>
</template>

<style scoped>

</style>