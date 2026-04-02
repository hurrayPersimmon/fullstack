<template>
  <div>
    <h2>check the console</h2>
  </div>
</template>

<script setup>
import axios from 'axios';

const requestAPI = async () => {
  const url = '/api/todoss';
  axios
    .get(url, { timeout: 900 })
    .then((response) => {
      console.log('response', response);
    })
    .catch((e) => {
      console.error(e);
    });
};

requestAPI();
</script>
