<template>
  <div>
    <h2>APP Component</h2>
    <hr />
    <ul>
      <CheckboxItem />
      <CheckboxItem />
      <CheckboxItem />
      <CheckboxItem />
    </ul>
  </div>
</template>

<script setup>
import { ref } from 'vue';
import CheckboxItem from './components/CheckboxItem.vue';

const checked = ref(false);
</script>

<style scoped></style>
