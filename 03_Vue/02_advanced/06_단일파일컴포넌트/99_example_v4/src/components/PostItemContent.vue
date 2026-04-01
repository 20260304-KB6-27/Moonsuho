<template>
  <div class="post-content">
    <h2>{{ postitem.title }}</h2>
    {{ postitem.content }}
    <br />
    <button @click="editPost(postitem)">수정</button>
    <button @click="deletePost(postitem.no)">삭제</button>
    <button @click="closePost">닫기</button>
  </div>
</template>

<script setup>
const props = defineProps({
  postitem: Object,
});
const emit = defineEmits(['close', 'delete', 'edit']);
const closePost = () => {
  emit('close');
};
const deletePost = (no) => {
  emit('delete', no);
};
const editPost = (post) => {
  emit('edit', post);
};
</script>

<style></style>
