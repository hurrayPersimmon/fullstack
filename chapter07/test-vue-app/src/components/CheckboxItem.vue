<template>
  <!-- <li><input type="checkbox" v-model="checked" />옵션 1</li> -->

  <li><input type="checkbox" :checked="checked" />{{ id }} {{ name }}</li>
</template>

<script>
export default {
  name: 'CheckboxItem',
  // props: ['name', 'checked'],
  props: {
    id: [Number, String],
    name: String,
    checked: {
      type: Boolean,
      required: false,
      default: false,
    },
  },
};
</script>
