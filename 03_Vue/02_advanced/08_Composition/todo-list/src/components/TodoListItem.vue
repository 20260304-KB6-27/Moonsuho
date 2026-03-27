<template>
  <li @click="toggleComplted(todoitem.id)">
    <span
      :style="{ textDecoration: todoitem.completed ? 'line-through' : 'none' }"
      >{{ todoitem.todo }}{{ todoitem.completed ? '[완료]' : '' }}</span
    >
    <span @click="deleteTodo(todoitem.id)"> [삭제]</span>
  </li>
</template>

<script setup>
const props = defineProps({
  todoitem: Object,
});

const emit = defineEmits(['toggle', 'delete']);
const toggleComplted = (id) => {
  emit('toggle', id);
};
const deleteTodo = (id) => {
  emit('delete', id);
};
</script>

<style scoped></style>
