<template>
  <li>
    <i :class="song.done ? true : false"></i>
    {{ song.title }}
  </li>
</template>
<script>
export default {
  name: 'SongListItem',
  props: ['song'],
};
</script>
