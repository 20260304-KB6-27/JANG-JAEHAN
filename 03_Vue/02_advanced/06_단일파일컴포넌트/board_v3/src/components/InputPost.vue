<template>
  <div class="data-post">
    <input
      type="text"
      placeholder="새 게시글 제목"
      v-model="new_post.title"
      @keyup.enter.exact="addPost"
    />
    <input
      type="text"
      placeholder="새 게시글 내용"
      v-model="new_post.content"
      @keyup.enter.exact="addPost"
    />
    <button @click="addPost">작성</button>
  </div>
</template>

<script setup>
import { ref } from "vue";

const new_post = ref({
  title: "",
  content: "",
});

const emit = defineEmits(["add"]);

const addPost = () => {
  if (new_post.value.title.trim() === "") return;
  if (new_post.value.content.trim() === "") return;

  emit("add", {
    title: new_post.value.title,
    content: new_post.value.content,
  });

  // post 초기화
  new_post.value.title = "";
  new_post.value.content = "";
};
</script>

<style lang="scss" scoped></style>
