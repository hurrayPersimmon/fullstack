<template>
  <div>
    <h2>check the console</h2>
  </div>
</template>

<script setup>
import axios from 'axios';

const requestAPI = () => {
  // const url = 'http://localhost:3000/todos/1';
  const url = 'api/todos';
  axios
    .get(url)
    .then((response) => {
      console.log('response : ', response);
      // console.log(response.data[0]);
      return response;
    })
    .then((response) => {
      console.log(response.data[0]);
    })
    .catch((e) => console.error(e));
};

requestAPI();
</script>
