<template>
  <div class="card shadow-sm border-0 mb-4">
    <div class="card-header bg-primary text-white fw-bold">Post article</div>

    <div class="card-body">
      <div class="mb-3">
        <label class="form-label">title</label>
        <input
          v-model="title"
          type="text"
          class="form-control"
          placeholder="제목을 입력하세요"
        />
      </div>

      <div class="mb-3">
        <label class="form-label">writer</label>
        <input
          v-model="writer"
          type="text"
          class="form-control"
          placeholder="작성자명을 입력하세요"
        />
      </div>

      <div class="mb-3">
        <label class="form-label">content</label>
        <textarea
          v-model="content"
          rows="4"
          class="form-control"
          placeholder="내용을 입력하세요"
        ></textarea>
      </div>

      <button class="btn btn-primary w-100" @click="submitBoard">
        article post
      </button>
    </div>
  </div>
</template>

<script setup>
import { useBoardStore } from '@/stores/boardStore';
import { ref } from 'vue';

const boardStore = useBoardStore();

const title = ref('');
const writer = ref('');
const content = ref('');

const submitBoard = () => {
  if (!title.value.trim()) {
    alert('title empty');
    return;
  }
  if (!writer.value.trim()) {
    alert('writer empty');
    return;
  }
  if (!content.value.trim()) {
    alert('content empty');
    return;
  }

  boardStore.addBoard({
    title: title.value,
    writer: writer.value,
    content: content.value,
  });

  title.value = '';
  writer.value = '';
  content.value = '';
};
</script>

<style></style>
