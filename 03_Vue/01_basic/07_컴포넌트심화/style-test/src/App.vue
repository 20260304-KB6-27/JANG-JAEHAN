<script setup>
import GlobalCssDemo from './components/GlobalCssDemo.vue';
import ScopedCssDemo from './components/ScopedCssDemo.vue';
import CssModuleDemo from './components/CssModuleDemo.vue';
</script>
<template>
  <div class="container">
    <h1>Vue CSS 스타일 방법</h1>
    <!-- 전역 CSS 적용 컴포넌트 -->
    <GlobalCssDemo />

    <!-- Scoped CSS 적용 컴포넌트 -->
    <ScopedCssDemo />

    <!-- CSS 모듈 적용 컴포넌트 -->
    <CssModuleDemo />
  </div>
</template>

<!-- scoped 제거 시 전역-->
<!-- App.vue 의 <style> : 전역처럼 작동함-->
<!-- main.css와 역할을 구분하기 위해 주로 앱의 레이아웃 구성 -->
<style>
.container {
  max-width: 600px;
  margin: 40px auto;
}
</style>
