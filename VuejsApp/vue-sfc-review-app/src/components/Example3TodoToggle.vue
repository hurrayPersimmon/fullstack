<template>
  <div class="box">
    <h2>3. To do List</h2>
    <p class="desc">
      parents send props to child but child do not modify their data. child just
      ask parent to modify the data.
    </p>

    <ul class="todo-list">
      <TodoItem
        v-for="todo in todos"
        :key="todo.id"
        :todo="todo"
        @toggle-todo="toggleTodoHandler"
      />
    </ul>
  </div>
</template>

<script>
import TodoItem from './TodoItem.vue';

export default {
  name: 'Example3TodoToggle',
  components: {
    TodoItem,
  },
  data() {
    return {
      todos: [
        { id: 1, text: 'Vue SFC Review', completed: false },
        { id: 2, text: 'props and emit', completed: true },
        { id: 3, text: 'mitt practice', completed: false },
      ],
    };
  },
  methods: {
    toggleTodoHandler(id) {
      const found = this.todos.find((item) => item.id === id);

      if (found) {
        found.completed = !found.completed;
      }
    },
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

.todo-list {
  margin-top: 16px;
}
</style>
