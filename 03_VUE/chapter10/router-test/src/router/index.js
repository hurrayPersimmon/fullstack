import About from '@/pages/About.vue';
import Home from '@/pages/Home.vue';
import MemberInfo from '@/pages/MemberInfo.vue';
import Members from '@/pages/Members.vue';
import Videos from '@/pages/Videos.vue';
import { createRouter, createWebHistory } from 'vue-router';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    { path: '/', name: 'home', component: Home },
    { path: '/about', name: 'about', component: About },
    { path: '/members', name: 'members', component: Members },
    { path: '/members/:id', name: '', component: MemberInfo },
    {
      path: '/songs',
      name: 'videos',
      component: Videos,
      // children: [{ path: ':id', name: 'videos/id', component: VideoPlayer }],
    },
  ],
});

export default router;
