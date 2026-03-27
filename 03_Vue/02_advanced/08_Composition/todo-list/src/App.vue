<template>
  <h1>::TODolist APP</h1>
  <InputTag @add="addTodo"></InputTag>
  <TodoList :todolist="todolist" @toggle="toggleComplted" @delete="deleteTodo">
  </TodoList>
</template>

<script setup>
import { ref } from 'vue';
import TodoList from './components/TodoList.vue';
import InputTag from './components/InputTag.vue';
let ts = new Date().getTime();
const todolist = ref([
  { id: ts, todo: '자전거 타기', completed: false },
  { id: ts + 1, todo: '딸과 공원 산책', completed: true },
  { id: ts + 2, todo: '일요일 애견 카페', completed: false },
  { id: ts + 3, todo: 'Vue 원고 집필', completed: false },
]);
const toggleComplted = (id) => {
  let index = todolist.value.findIndex((item) => id === item.id);
  todolist.value[index].completed = !todolist.value[index].completed;
};
const deleteTodo = (id) => {
  let index = todolist.value.findIndex((item) => id === item.id);
  todolist.value.splice(index, 1);
};
const addTodo = (newTodo) => {
  todolist.value.push(newTodo);
};
</script>

<style scoped></style>
