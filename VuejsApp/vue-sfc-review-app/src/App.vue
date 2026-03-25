<template>
  <div class="app-wrapper">
    <header class="header">
      <h1>Vue SFC review project</h1>
      <p>single file component, props, emit, mitt are in just one project.</p>
    </header>

    <section class="content">
      <Example1TechChecklist v-if="selectedExample === 1" />
      <Example2StudentRegister v-else-if="selectedExample === 2" />
      <Example3TodoToggle v-else-if="selectedExample === 3" />
      <Example4NoticeMitt v-else />
    </section>
  </div>
</template>

<script>
import Example1TechChecklist from './components/Example1TechChecklist.vue';
import Example2StudentRegister from './components/Example2StudentRegister.vue';
import Example3TodoToggle from './components/Example3TodoToggle.vue';
import Example4NoticeMitt from './components/Example4NoticeMitt.vue';

export default {
  name: 'App',
  components: {
    Example1TechChecklist,
    Example2StudentRegister,
    Example3TodoToggle,
    Example4NoticeMitt,
  },

  data() {
    return {
      selectedExample: 3,
      menuList: [
        { id: 1, label: '1. props primary' },
        { id: 2, label: '2. Emit primary' },
        { id: 3, label: '3. Directive Data Flow' },
        { id: 4, label: '4. mitt sibling' },
      ],
    };
  },
};
</script>
