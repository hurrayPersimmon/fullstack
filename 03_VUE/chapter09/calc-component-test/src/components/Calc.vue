<template>
  <div>X : <input type="text" v-model.number="x" /></div>
  <div>Y : <input type="text" v-model.number="y" /></div>
</template>

<script>
import { ref } from 'vue';

export default {
  name: 'Calc',
  setup() {
    const x = ref(10);
    const y = ref(20);

    console.log(x);
    console.log(y);

    return { x, y };
  },
};
</script>
