<template>
  <li class="post-item">
    {{ postitem.no }}. {{ postitem.title }}

    <span class="arrow" @click.stop="togglePost(postitem)">
      {{ selectedPost && selectedPost.no === postitem.no ? '▲' : '▼' }}
    </span>
  </li>

  <EditPost
    v-if="isEditing"
    :postitem="postitem"
    :editForm="editForm"
    @cancel="cancelEdit"
    @update="updatePost"
  ></EditPost>

  <PostDetail
    v-else
    :postitem="postitem"
    :selectedPost="selectedPost"
    @select="togglePost"
    @edit="startEdit"
    @delete="deletePost"
  ></PostDetail>
</template>

<script setup>
import EditPost from './EditPost.vue';
import PostDetail from './PostDetail.vue';
import { ref } from 'vue';
const props = defineProps({
  postitem: Object,
});

// emit
const emit = defineEmits(['update', 'delete']);

const selectedPost = ref(null);
const isEditing = ref(false);
const editForm = ref({
  no: 0,
  title: '',
  content: '',
});

// 이벤트 관리
const togglePost = (post) => {
  if (isEditing.value) return;

  if (selectedPost.value && selectedPost.value.no === post.no) {
    selectedPost.value = null;
  } else {
    selectedPost.value = post;
  }
};

const startEdit = (post) => {
  selectedPost.value = null;
  isEditing.value = true;
  editForm.value = { ...post };
};

const cancelEdit = () => {
  isEditing.value = false;
};

const updatePost = (updatedPost) => {
  emit('update', updatedPost);
  isEditing.value = false;
  selectedPost.value = { ...updatedPost };
};

const deletePost = (no) => {
  emit('delete', no);
};
</script>

<style lang="scss" scoped></style>
