<script setup>

</script>

<template>
  <div class="navBar">
    <div class="navigation-item">
      <img src="../components/icons/calendarW.png" />
      <span>Meldingen</span>
    </div>
    <div class="navigation-item">
      <img src="../components/icons/homeW.png" />
      <span>Home</span>
    </div>
    <RouterLink to="/profile" style="text-decoration: none">
      <div class="navigation-item">
        <img src="../components/icons/profileW.png" />
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
  background-color: #FFFFC9 !important;
}

.navigation-item {
  display: flex;
  flex-direction: column;
  align-items: center;
  cursor: pointer;
  color: white;
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