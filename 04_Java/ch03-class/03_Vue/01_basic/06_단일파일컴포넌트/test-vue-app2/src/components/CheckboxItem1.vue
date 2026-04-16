<template>
  <li><input type="checkbox" :checked="checked" />{{ name }}</li>
</template>

<!-- setup을 사용하지 않았을 때-->
<!-- <script>
import { ref } from 'vue';
export default {
  name: 'CheckboxItem',
  setup() {
    const checked = ref(false);

    return { checked };
  },
};
</script> -->

<!-- setup을 사용했을 때-->
<script setup>
// defineProps : 부모 요소에서 전달받은 Props를 정의하는 함수
defineProps(['name', 'checked']);
</script>

<style lang="scss" scoped></style>
