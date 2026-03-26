<template>
  <!-- 
    Teleport: 컴포넌트의 일부 HTML을 컴포넌트가 위치한 곳이 아닌 다른 DOM 위치(:to)로 렌더링
    - 컴포넌트 계층 : App 자식으로 남아있음
    - 실제 DOM 렌더링 위치: to 속성에 정의한 요소 안으로 이동 
    
    -->
  <Teleport to="#modal"></Teleport>
  <Modal v-if="isModal"></Modal>

  <div>
    <h2>Teleport 텍스트</h2>
    <hr />
    <button @click="openModal">모달열기</button>
  </div>
</template>

<script setup>
import Modal from './components/Modal.vue';
import { ref } from 'vue';

const isModal = ref(false);
function openModal() {
  isModal.value = true;
}
</script>

<style scoped></style>
