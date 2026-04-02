<template>
  <div>
    <h2>check the console</h2>
  </div>
</template>

<script setup>
import axios from 'axios';
const requestAPI = async () => {
  const url = '/api/todos';
  const response = await axios.get(url);
  console.log('response : ', response);
};
requestAPI();
</script>
