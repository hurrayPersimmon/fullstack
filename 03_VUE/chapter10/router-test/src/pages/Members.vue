<template>
  <div>
    <h2 class="m-4">이날치 멤버</h2>
    <div class="container">
      <div class="row">
        <div
          v-for="member in members"
          :key="member.id"
          class="col-6 col-xs-6 col-sm-4 col-md-3 col-lg-2"
        >
          <!-- <router-link :to="'/members/' + member.id"> -->
          <router-link :to="{ name: '/members/id', params: { id: member.id } }">
            <img
              class="img-thumbnail"
              style="width: 90px; height: 110px"
              :src="member.photo"
              :title="member.name"
            /><br />
            <h6 class="display-7">{{ m.name }}</h6>
          </router-link>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
import members from '@/members.json';
</script>
