<template>
  <!-- <li><input type="checkbox" v-model="checked" />옵션 1</li> -->

  <li><input type="checkbox" :checked="idol.checked" />{{ idol.name }}</li>
</template>

<script>
export default {
  name: 'CheckboxItem',
  props: ['idol'],
};
</script>
