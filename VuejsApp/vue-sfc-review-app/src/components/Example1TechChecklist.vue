<template>
  <div class="box">
    <h2>1. tech skills check list</h2>
    <p class="desc">
      parants have data of array and child gets props and views props.
    </p>
    <ul class="list">
      <TechItem
        v-for="tech in techList"
        :key="tech.id"
        :name="tech.name"
        :checked="tech.checked"
      />
    </ul>
  </div>
</template>

<script>
import TechItem from './TechItem.vue';

export default {
  name: 'Example1TechChecklist',
  components: { TechItem },
  data() {
    return {
      techList: [
        { id: 1, name: 'Java', checked: true },
        { id: 2, name: 'Spring Boot', checked: true },
        { id: 3, name: 'Vue', checked: false },
        { id: 4, name: 'Docker', checked: false },
      ],
    };
  },
};
</script>

<style scoped>
.box {
  padding: 12px;
}

.desc {
  color: #666;
}

.list {
  margin-top: 16px;
}
</style>
