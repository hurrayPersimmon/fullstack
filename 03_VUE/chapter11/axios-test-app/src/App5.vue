<template>
  <div>
    <h2>check the console</h2>
  </div>
</template>

<script setup>
import axios from 'axios';

const requestAPI = async () => {
  const url = '/api/todoss';
  try {
    const response = await axios.get(url, { timeout: 900 });
    console.log('response : ', response);
  } catch (e) {
    console.log('error : ');
    if (e instanceof Error) console.log(e.message);
    else console.error(e);
  }
};
requestAPI();
</script>
