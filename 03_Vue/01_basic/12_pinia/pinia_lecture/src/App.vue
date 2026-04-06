<template>
  <h1>APP</h1>
  <Like></Like>
  <h2>좋아요 갯수: {{ likecount.like }}</h2>
  <h2>5배씩 불려서 좋아요 보기: {{ likecount.fivetime }}</h2>

  <hr />
  <h2>App에서 보는 Counter: {{ counter.count }}</h2>
  <Counter></Counter>
</template>

<script setup>
import Counter from './components/Counter.vue';
import Like from './components/Like.vue';
// import { useCounterStore } from './stores/counter';
import { useCounterPersistStore } from './stores/persist/persist_counter';
import { useLikePersistStore } from './stores/persist/persist_like';
// import { useLikeStore } from './stores/like';
const counter = useCounterPersistStore();
const likecount = useLikePersistStore();
</script>
<style scoped></style>
