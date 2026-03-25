<template>
  <div class="box">
    <h2>2. student register app</h2>
    <p class="desc">
      child has input and send input data by emit to parent, parent admin their
      list.
    </p>

    <StudentInput @add-student="addStudentHandler" />

    <h3>Student register list</h3>
    <ul>
      <li v-for="(student, index) in students" :key="index">
        {{ student }}
      </li>
    </ul>
  </div>
</template>

<script>
import StudentInput from './StudentInput.vue';

export default {
  name: 'Example2StudentRegister',
  components: {
    StudentInput,
  },

  data() {
    return {
      students: ['yasuo', 'irellia'],
    };
  },
  methods: {
    addStudentHandler(name) {
      this.students.push(name);
    },
  },
};
</script>

<style scoped>
.box {
  padding: 12px;
}

.desc {
  color: #666;
  margin-bottom: 16px;
}
</style>
