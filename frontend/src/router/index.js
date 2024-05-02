import { createRouter, createWebHistory } from 'vue-router';
import HomeView from '../views/HomeView.vue';
import detailsBookView from "@/views/DetailsBookView.vue";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/details/:id',
      name: 'detailsBook',
      component: detailsBookView,
      props: true,
    },
  ]
})

export default router
