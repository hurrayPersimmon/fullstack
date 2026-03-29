<template>
  <div>
    X : <input type="text" v-model.number="x" /> Y :
    <input type="text" v-model.number="y" />

    <br />
  </div>
</template>

<script>
import { reactive, watch, watchEffect } from 'vue';

export default {
  name: 'Calc6',
  setup() {
    const x = ref(10);
    const y = ref(20);
    const result = ref(30);

    const state = reactive({ x: 0, result: 0 });
    watchEffect(() => {
      result.value = x.value + y.value;
      console.log(`${x.value} + ${y.value} = ${result.value}`);
    });

    return { x, y, result };
  },
};
</script>
