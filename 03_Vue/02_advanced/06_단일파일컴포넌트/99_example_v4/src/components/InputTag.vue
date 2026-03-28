<template>
  <input
    type="text"
    v-model.trim="newPost.title"
    placeholder="새 게시글 제목"
  />
  <input
    type="text"
    v-model.trim="newPost.content"
    placeholder="새 게시글 내용"
  />
  <button @click="addPost">작성</button>
</template>

<script setup>
import { ref } from 'vue';
const newPost = ref({
  title: '',
  content: '',
});
const props = defineProps({
  posts: Array,
});

const emit = defineEmits(['add']);
const addPost = (e) => {
  if (newPost.value.title === '' || newPost.value.content === '') return;
  const lastNo = props.posts[props.posts.length - 1].no;
  emit('add', {
    no: lastNo + 1,
    title: newPost.value.title,
    content: newPost.value.content,
  });
  newPost.value.title = '';
  newPost.value.content = '';
};
</script>

<style></style>
