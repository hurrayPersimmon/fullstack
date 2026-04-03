import { createRouter, createWebHistory } from 'vue-router';
import Home from '@/pages/Home.vue';
import About from '@/pages/About.vue';
import NotFound from '@/pages/NotFound.vue';
import EditTodo from '@/pages/EditTodo.vue';
import AddTodo from '@/pages/AddTodo.vue';
import TodoList from '@/pages/TodoList.vue';

const router = createRouter({
  history: createWebHistory(),
  routes: [
    { path: '/', redirect: '/todos' },
    // { path: '/', component: Home },
    { path: '/home', component: Home },
    { path: '/about', component: About },
    { path: '/todos', component: TodoList },
    { path: '/todos/add', component: AddTodo },
    { path: '/todos/edit/:id', component: EditTodo },
    { path: '/:path(.*)*', component: NotFound },
  ],
});

export default router;
