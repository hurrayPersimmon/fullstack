<script setup>
import { useCounterStore } from './stores/counter';
import { computed } from 'vue';

// 구조분해할당 시, 캐시 값을 복사를 해오기 때문에 직접적인 변경이 불가능.
// const { count, doubleCount, increment } = useCounterStore();
const { increment } = useCounterStore();
const store = useCounterStore();
const count = computed(() => store.count);

const doubleCount = computed(() => store.doubleCount);
// console.log(store);
</script>

<template>
  count : {{ count }}
  <br />
  doubleCount : {{ doubleCount }}
  <button @click="increment">123</button>
</template>

<style scoped></style>
