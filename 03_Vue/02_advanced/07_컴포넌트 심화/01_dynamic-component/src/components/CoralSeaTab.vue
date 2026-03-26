<template>
  <div>
    <h1>산호해 해전에 대해 ...</h1>
    <div>{{ new Date().toTimeString() }}</div>
  </div>
</template>

<script setup>
//컴포넌트 이름 직접 지정
//컴포넌트 파일 복붙하는 과정에서 내부적으로 꼬인 것 같아서, 직접 지정해줌
defineOptions({
  name: 'CoralSeaTab',
});
</script>

<style scoped></style>
