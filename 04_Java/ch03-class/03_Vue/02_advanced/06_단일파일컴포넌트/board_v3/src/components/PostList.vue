<template>
  <ul>
    <PostItem
      v-for="postitem in posts"
      :key="postitem.no"
      :postitem="postitem"
      @delete="deletePost"
      @update="updatePost"
    >
    </PostItem>
  </ul>
</template>

<script setup>
import PostItem from './PostItem.vue';
const props = defineProps({
  posts: Array,
});

// emit
const emit = defineEmits(['update', 'delete']);

const updatePost = (updatePost) => {
  emit('update', updatePost);
};
const deletePost = (no) => {
  emit('delete', no);
};
</script>

<style lang="scss" scoped></style>
