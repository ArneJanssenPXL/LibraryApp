<script setup>

</script>

<template>
  <div class="navBar">
    <div class="navigation-item">
      <img src="../components/icons/calendarB.png" />
      <span>Meldingen</span>
    </div>
    <RouterLink to="/" style="text-decoration: none">
    <div class="navigation-item">
      <img src="../components/icons/homeB.png" />
      <span>Home</span>
    </div>
    </RouterLink>
    <RouterLink to="/about" style="text-decoration: none">
      <div class="navigation-item">
        <img src="../components/icons/profileB.png" />
        <span>Profiel</span>
      </div>
    </RouterLink>
  </div>
</template>

<style scoped>
.navBar {
  display: flex;
  justify-content: space-around;
  align-items: center;
  position: fixed;
  bottom: 0;
  left: 0;
  width: 100%;
  height: 75px;
  background-color: #9e9e9e !important;
}

.navigation-item {
  display: flex;
  flex-direction: column;
  align-items: center;
  cursor: pointer;
  color: #000000;
}

.navigation-item img {
  margin-top: 8px;
  width: 25%;
}

.navigation-item span {
  font-size: 16px;
  margin-top: 5px;
}
</style>