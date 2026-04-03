<template>
  <div class="wrap">
    <h1>axios practice exercise</h1>
    <p>
      REST API, json-server, axios, GET, POST, PUT, DELETE, proxy, async/await,
      error practice at one time.
    </p>
    <hr />
    <h2>1. get request : get All Todos</h2>
    <button @click="getTodos">전체 조회</button>

    <ul>
      <li v-for="item in todos" :key="item.id">
        <span>
          {{ item.id }} / {{ item.todo }} / {{ item.todo }} / complete :
          {{ item.done }}
        </span>
        <button class="small-btn" @click="editTodo(item)">수정</button>
        <button class="small-btn delete-btn" @click="deleteTodo(item.id)">
          삭제
        </button>
      </li>
    </ul>

    <hr />
    <h2>
      {{
        isEditMode ? '2. PUT 요청으로 Todo 수정' : '2. POST 요청으로 Todo 등록'
      }}
    </h2>

    <div class="form-box">
      <input v-model="todo" placeholder="할일 입력" />
      <input v-model="desc" placeholder="설명 입력" />

      <label class="check-wrap">
        <input type="checkbox" v-model="done" />
        완료 여부
      </label>
    </div>

    <div class="btn-box">
      <button v-if="!isEditMode" @click="addTodo">등록</button>
      <button v-if="isEditMode" @click="updateTodo">수정 완료</button>
      <button v-if="isEditMode" @click="cancelEdit">취소</button>
    </div>

    <hr />

    <h2>3. 에러 처리 실습</h2>
    <button @click="testError">없는 주소 요청하기</button>

    <p v-if="message" class="msg">{{ message }}</p>
    <p v-if="errorMessage" class="error">{{ errorMessage }}</p>
  </div>
</template>

<script setup>
import axios from 'axios';
import { onMounted, ref } from 'vue';

const todos = ref([]);
const todo = ref('');
const desc = ref('');
const done = ref(false);
const message = ref('');
const errorMessage = ref('');
const isEditMode = ref(false);
const editId = ref(null);

const resetform = () => {
  todo.value = '';
  desc.value = '';
  done.value = false;
  editId.value = null;
  isEditMode.value = false;
}; //resetform

const getTodos = async () => {
  message.value = '';
  errorMessage.value = '';

  try {
    const response = await axios.get('/api/todos');
    // console.log(response);
    // console.log(response.data);

    todos.value = response.data;
    message.value = 'get all data complete';
  } catch (error) {
    errorMessage.value = 'error occured!!!';
  }
}; //getTodos

const addTodo = async () => {
  message.value = '';
  errorMessage.value = '';
  if (todo.value.trim() || !desc.value.trim()) {
    errorMessage.value = 'put todo and description';
  }

  const newTodo = {
    todo: todo.value,
    desc: desc.value,
    dnoe: done.value,
  };

  try {
    const response = await axios.post('/api/todos', newTodo);
    message.value = 'todo save complete';
    resetform();
  } catch (e) {
    errorMessage = 'occurs Error!!';
  }
};

const editTodo = (item) => {
  todo.value = item.todo;
  desc.value = item.desc;
  done.value = item.done;
  editId.value = item.id;
  isEditMode.value = true;
  message.value = 'after modifying press the updating button';
  errorMessage.value = '';
};

const updateTodo = async () => {
  message.value = '';
  errorMessage.value = '';

  if (!todo.value.trim() || !desc.value.trim()) {
    errorMessage.value = '할일과 설명을 모두 입력하세요.';
    return;
  }

  const updatedTodo = {
    id: editId.value,
    todo: todo.value,
    desc: desc.value,
    done: done.value,
  };

  try {
    const response = await axios.put(`/api/todos/${editId.value}`, updatedTodo);
    console.log('# PUT 응답객체:', response);
    console.log('# PUT 실제 데이터:', response.data);

    message.value = 'Todo가 수정되었습니다.';
    resetform();

    await getTodos();
  } catch (error) {
    console.log('PUT 요청 중 오류 발생');
    console.log(error);
    errorMessage.value = '수정 중 오류가 발생했습니다.';
  }
}; //updateTodo

const cancelEdit = () => {
  resetform();
  message.value = '수정이 취소되었습니다.';
  errorMessage.value = '';
}; //cancelEdit

const deleteTodo = async (id) => {
  message.value = '';
  errorMessage.value = '';

  try {
    const response = await axios.delete(`/api/todos/${id}`);
    console.log('# DELETE 응답객체:', response);

    message.value = 'Todo가 삭제되었습니다.';

    if (editId.value === id) {
      resetform();
    }

    await getTodos();
  } catch (error) {
    console.log('DELETE 요청 중 오류 발생');
    console.log(error);
    errorMessage.value = '삭제 중 오류가 발생했습니다.';
  }
};

const testError = async () => {
  message.value = '';
  errorMessage.value = '';

  try {
    const response = await axios.get('/api/todos2', { timeout: 1000 });
    console.log(response);
  } catch (error) {
    console.log('에러 테스트 발생');
    console.log(error);

    if (error instanceof Error) {
      errorMessage.value = `오류 메시지: ${error.message}`;
    } else {
      errorMessage.value = '알 수 없는 오류가 발생했습니다.';
    }
  }
};
onMounted(() => {
  // getTodos();
});
</script>
<style>
.wrap {
  width: 800px;
  margin: 30px auto;
  font-family: Arial, sans-serif;
  line-height: 1.6;
}

.form-box {
  margin-top: 10px;
}

input[type='text'],
input:not([type='checkbox']) {
  padding: 8px;
  margin-right: 8px;
  margin-bottom: 8px;
}

button {
  padding: 8px 12px;
  margin-top: 5px;
  margin-right: 6px;
  cursor: pointer;
}

.small-btn {
  margin-left: 8px;
  padding: 4px 8px;
}

.delete-btn {
  background-color: #ffe5e5;
  border: 1px solid #ffb3b3;
}

.btn-box {
  margin-top: 10px;
}

.check-wrap {
  display: inline-block;
  margin-left: 10px;
}

ul {
  margin-top: 15px;
  padding-left: 20px;
}

li {
  margin-bottom: 10px;
}

.msg {
  color: green;
  font-weight: bold;
}

.error {
  color: red;
  font-weight: bold;
}
</style>
