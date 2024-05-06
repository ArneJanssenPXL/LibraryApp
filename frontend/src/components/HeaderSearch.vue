<template>
  <div class="header">
    <input type="text" placeholder="Search..." class="search-bar">
  </div>
</template>

<script setup>
</script>

<style scoped>
/*.header {
  display: flex;
  justify-content: center;
  align-items: center;
  background-color: #9e9e9e;
  height: 75px;
}*/
.header {
  display: flex;
  justify-content: space-around;
  align-items: center;
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  height: 75px;
  background-color: #9e9e9e !important;
}
.search-bar {
  padding: 10px;
  border-radius: 5px;
  border: none;
  outline: none;
  width: 80%;
  max-width: 300px;
  background-color: white;
  box-shadow: 0px 2px 4px rgba(0, 0, 0, 0.1);
  font-size: 16px;
}
</style>
