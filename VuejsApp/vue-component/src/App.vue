<template>
  <div class="app-shell">
    <!-- <StyleExample /> -->
    <!-- <SlotExample /> -->
    <!-- <DynamicExample /> -->
    <!-- <VModelExample /> -->
    <ProvideInjectExample />
    <!-- <TeleportExample /> -->
    <!-- <AsyncExample /> -->
  </div>
</template>

<script>
// import StyleExample from './examples/StyleExample.vue';
// import SlotExample from './examples/SlotExample.vue';
// import DynamicExample from './examples/DynamicExample.vue';
// import VModelExample from './examples/VModelExample.vue'
import ProvideInjectExample from './examples/ProvideInjectExample.vue';
// import TeleportExample from './examples/TeleportExample.vue'
// import AsyncExample from './examples/AsyncExample.vue'

export default {
  name: 'App',
  components: {
    // StyleExample,
    // SlotExample,
    // DynamicExample,
    // VModelExample,
    ProvideInjectExample,
    // TeleportExample,
    // AsyncExample,
  },
};
</script>

<style>
.app-shell {
  padding: 30px;
}
</style>
