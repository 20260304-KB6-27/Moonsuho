<template>
  <PostItem
    v-for="postitem in reversePost"
    :postitem="postitem"
    :selectPostNo="selectPostNo"
    @toggle="clickToMenu"
    @close="closePost"
    @delete="deletePost"
    @edit="editPost"
    :selectEditPostNo="selectEditPostNo"
    :editingForm="editingForm"
    @cancel="EditCancel"
    @save="SavePost"
  >
  </PostItem>
</template>

<script setup>
import PostItem from './PostItem.vue';
import { computed } from 'vue';
const props = defineProps({
  posts: Array,
  selectPostNo: Number,
  selectEditPostNo: Number,
  editingForm: Object,
});
const emit = defineEmits([
  'toggle',
  'close',
  'delete',
  'edit',
  'cancel',
  'save',
]);
const clickToMenu = (no) => {
  emit('toggle', no);
};
const closePost = () => {
  emit('close');
};
const deletePost = (no) => {
  emit('delete', no);
};
const editPost = (post) => {
  emit('edit', post);
};

const SavePost = (editpost) => {
  emit('save', editpost);
};

const EditCancel = () => {
  emit('cancel');
};
// Post 최신순으로
const reversePost = computed(() => {
  return props.posts.slice().reverse(); //slice: posts 복사
});
</script>

<style></style>
