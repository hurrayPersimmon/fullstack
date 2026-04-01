<template>
  <!-- <div class="card card-body">
    <h2>Member Info</h2>
    <div>
      pattern : /members/:id <br />
      request {{ currentRoute.path }}<br />
      id : {{ currentRoute.params.id }}<br />
    </div>
  </div> -->

  <div className="mt-5">
    <img :src="member.photo" class="img" />
    <h4 class="mt-2">{{ member.name }}({{ member.role }})</h4>
    <p>{{ member.desc }}</p>
    <a
      v-if="member.insta && member.insta !== ''"
      class="fa fa-instagram m-1"
      :href="member.insta"
    ></a>
    <a
      v-if="member.facebook && member.facebook !== ''"
      class="fa fa-facebook m-1"
      :href="member.facebook"
    ></a>
    <a
      v-if="member.youtube && member.youtube !== ''"
      class="fa fa-youtube m-1"
      :href="member.youtube"
    ></a>
    <br /><br />
    <!-- <router-link to="/members">멤버 목록으로</router-link> -->
    <router-link to="{name : 'members'}">멤버 목록으로</router-link>
  </div>
</template>

<script setup>
import { useRoute } from 'vue-router';
const currentRoute = useRoute();
</script>
