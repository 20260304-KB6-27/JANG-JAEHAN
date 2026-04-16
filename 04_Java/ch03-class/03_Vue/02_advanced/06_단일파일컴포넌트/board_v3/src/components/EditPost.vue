<template>
  <div v-if="editForm && editForm.no === postitem.no" class="post-content">
    <textarea v-model="editForm.title"></textarea>
    <br />
    <textarea v-model="editForm.content"></textarea>
    <br />

    <button @click="updatePost">저장</button>
    <button @click="cancelEdit">취소</button>
  </div>
</template>

<script setup>
const props = defineProps({
  postitem: {
    type: Object,
    required: true,
  },
  editForm: {
    type: Object,
    required: true,
  },
});

const emit = defineEmits(['cancel', 'update']);

const cancelEdit = () => {
  emit('cancel');
};

const updatePost = () => {
  emit('update', { ...props.editForm });
};
</script>

<style lang="scss" scoped></style>
