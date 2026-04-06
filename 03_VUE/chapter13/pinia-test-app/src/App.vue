<template>
  <div>
    <h2>TodoList test(Composition API)</h2>
    <hr />
    todo add :
    <input type="text" v-model="todo" />
    <button @click="addTodoHandler">add</button>
    <hr />
    <ul>
      <li v-for="todoItem in todoList">
        <span style="cursor: pointer" @click="toggleDone(todoItem.id)">
          {{ todoItem.todo }} {{ todoItem.done ? 'complete' : '' }}
        </span>
        &nbsp;&nbsp;&nbsp;
        <button @click="deleteTodo(todoItem.id)">delete</button>
      </li>
    </ul>
    <div>complete todo : {{ doneCount }}</div>
  </div>
</template>

<script setup>
import { useTodoStore } from './stores/todoList';
import { ref, computed } from 'vue';

const todo = ref('');
const todoListStore = useTodoStore();

// primitive가 아닌 type, 객체의 참조는 반응성이 유지된다.
const { todoList, addTodo, deleteTodo, toggleDone } = todoListStore;

// primitive에 대해서는 계산된 속성을 다시 작성.
const doneCount = computed(() => todoListStore.doneCount);

const addTodoHandler = () => {
  addTodo(todo.value);
  todo.value = '';
};
</script>
