<template>
  <div
    v-if="selectedPost && selectedPost.no === postitem.no"
    class="post-content"
  >
    <h2>{{ selectedPost.title }}</h2>
    <p>{{ selectedPost.content }}</p>
    <button @click.stop="editPost(postitem)">수정</button>
    <button @click.stop="deletePost(selectedPost.no)">삭제</button>
    <button @click.stop="selectPost(postitem)">닫기</button>
  </div>
</template>

<script setup>
// props
const props = defineProps({
  postitem: Object,
  selectedPost: Object,
});

// emit
const emit = defineEmits(['select', 'edit', 'delete']);
const selectPost = (postitem) => {
  emit('select', postitem);
};
const editPost = (postitem) => {
  emit('edit', postitem);
};
const deletePost = (no) => {
  emit('delete', no);
};
</script>

<style lang="scss" scoped></style>
