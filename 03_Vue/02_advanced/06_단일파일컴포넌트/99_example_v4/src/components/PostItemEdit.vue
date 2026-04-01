<template>
  <div class="post-content">
    <input v-model="editingForm.title" />
    <textarea v-model="editingForm.content"></textarea>
    <button @click="SavePost">저장</button>
    <button @click="EditCancel">취소</button>
  </div>
</template>

<script setup>
const props = defineProps({
  postitem: Object,
  selectEditPostNo: Number,
  editingForm: Object,
});

const emit = defineEmits(['save', 'cancel']);
//수정한 게시글 저장
const SavePost = () => {
  emit('save', props.editingForm);
};

//수정 중인 게시글 취소
const EditCancel = () => {
  emit('cancel');
};
</script>

<style scoped></style>
