<template>
  <h1 class="guide">Single Component Style</h1>

  <section class="page">
    <div class="grid">
      <GlobalBadge></GlobalBadge>
      <ModuleBadge></ModuleBadge>
      <ScopedBadge></ScopedBadge>
    </div>
  </section>
</template>

<script>
import GlobalBadge from '@/components/style/GlobalBadge.vue';
import ModuleBadge from '@/components/style/ModuleBadge.vue';
import ScopedBadge from '@/components/style/ScopedBadge.vue';

export default {
  name: 'StyleExample',
  data() {
    return {};
  },
  components: {
    GlobalBadge,
    ModuleBadge,
    ScopedBadge,
  },
};
</script>

<style scoped>
.page {
  max-width: 1100px;
  margin: 0 auto;
}

.guide {
  color: #555;
  margin-bottom: 24px;
  line-height: 1.7;
}

.grid {
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  gap: 18px;
}
</style>
