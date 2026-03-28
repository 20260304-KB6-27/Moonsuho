<template>
  <ul>
    <li>
      <div
        class="post-item"
        :selectPostNo="selectPostNo"
        @click="clickToMenu(postitem.no)"
      >
        {{ postitem.no }}. {{ postitem.title }}
        <span>{{ selectPostNo === postitem.no ? '▲' : '▼' }}</span>
      </div>
      <div v-if="selectPostNo === postitem.no">
        <PostItemEdit
          v-if="selectEditPostNo === postitem.no"
          :selectEditPostNo="selectEditPostNo"
          :editingForm="editingForm"
          @cancel="EditCancel"
          @save="SavePost"
        ></PostItemEdit>
        <PostItemContent
          v-else
          :postitem="postitem"
          @edit="editPost"
          @close="closePost"
          @delete="deletePost"
        ></PostItemContent>
      </div>
    </li>
  </ul>
</template>

<script setup>
import PostItemContent from './PostItemContent.vue';
import PostItemEdit from './PostItemEdit.vue';
const props = defineProps({
  postitem: Object,
  selectPostNo: Number,
  selectEditPostNo: Number,
  editingForm: Object,
});
const emit = defineEmits([
  'toggle',
  'close',
  'delete',
  'edit',
  'save',
  'cancel',
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
</script>

<style></style>
