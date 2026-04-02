<template>
  <div>
    <h2>check the console</h2>
  </div>
</template>

<script setup>
import axios from 'axios';

const requestAPI = async () => {
  const url = '/api/todos';
  const data = { todo: 'sit up 3set', desc: 'not too fast' };
  const response = await axios.post(url, data);
  console.log('response : ', response);
};
requestAPI();
</script>
