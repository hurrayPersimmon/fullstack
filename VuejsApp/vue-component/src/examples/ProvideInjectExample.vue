<template>
  <section clas="page">
    <h1>Provide / Inject example</h1>
    <p class="guide">
      상위 컴포넌트에서 공용 데이터를 제공하고, 하위 컴포넌트가 직접 주입받아
      사용합니다.
    </p>
    <MenuList :items="tasks" />
  </section>
</template>

<script>
import MenuList from '@/components/provide/MenuList.vue';
import { computed } from 'vue'; //node_modules/vue

export default {
  name: 'ProvideInjectExample',
  components: {
    MenuList,
  },

  data() {
    return {
      tasks: [
        { id: 1, name: 'Vue 슬롯 복습', done: true },
        { id: 2, name: '동적 컴포넌트 실습', done: true },
        { id: 3, name: 'Teleport 예제 만들기', done: false },
        { id: 4, name: '비동기 컴포넌트 정리', done: false },
      ],
    };
  },

  provide() {
    return {
      icons: {
        done: '완료',
        todo: '대기',
      },
      doneCount: computed(() => {
        return this.tasks.filter((task) => task.done).length;
      }),
    };
  },
};
</script>
