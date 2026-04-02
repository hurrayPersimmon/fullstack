import { fileURLToPath, URL } from 'node:url';

import { defineConfig } from 'vite';
import vue from '@vitejs/plugin-vue';
import vueDevTools from 'vite-plugin-vue-devtools';

// https://vite.dev/config/
export default defineConfig({
  plugins: [vue(), vueDevTools()],
  resolve: {
    alias: {
      '@': fileURLToPath(new URL('./src', import.meta.url)),
    },
  },

  server: {
    proxy: {
      // 최초 요청 경로 /api/todolist/1 을 localhost:3000/todolist/1로 변경 해줌.
      '/api': {
        target: 'http://localhost:3000',
        changeOrigin: true,
        // 주소 다듬어 줌.
        rewrite: (path) => path.replace(/^\/api/, ''),
      },
    },
  },
});
