<template>
  <h1>📌 게시판 목록 v4</h1>
  <InputTag :posts="posts" @add="addPost"></InputTag>
  <Posts
    :posts="posts"
    :selectPostNo="selectPostNo"
    @toggle="clickToMenu"
    @close="closePost"
    @delete="deletePost"
    @edit="editPost"
    :selectEditPostNo="selectEditPostNo"
    :editingForm="editingForm"
    @cancel="EditCancel"
    @save="SavePost"
  ></Posts>
</template>

<script setup>
import InputTag from './components/InputTag.vue';
import Posts from './components/Posts.vue';

import { ref, computed } from 'vue';

const posts = ref([
  {
    no: 1,
    title: 'Vue.js 기초 배우기',
    content:
      'Vue.js는 사용자 인터페이스를 구축하기 위한 프로그레시브 프레임워크입니다.',
  },
  {
    no: 2,
    title: '자바스크립트 ES6 문법',
    content:
      'ES6는 JavaScript의 최신 문법을 포함하며, let/const, 화살표 함수, 구조 분해 할당 등을 제공합니다.',
  },
  {
    no: 3,
    title: 'Node.js와 Express',
    content:
      'Node.js는 서버 측에서 JavaScript를 실행할 수 있도록 하는 런타임이며, Express는 이를 위한 경량 웹 프레임워크입니다.',
  },
  {
    no: 4,
    title: 'MongoDB 기본 개념',
    content:
      'MongoDB는 NoSQL 데이터베이스로 JSON과 유사한 문서 기반 데이터를 저장하고 관리할 수 있습니다.',
  },
  {
    no: 5,
    title: '프론트엔드와 백엔드의 차이',
    content:
      '프론트엔드는 사용자가 보는 부분을 개발하는 것이고, 백엔드는 서버와 데이터베이스를 관리하는 부분입니다.',
  },
  {
    no: 6,
    title: '비동기 프로그래밍',
    content:
      'JavaScript의 비동기 처리 방식에는 콜백, 프로미스, async/await가 있습니다.',
  },
  {
    no: 7,
    title: 'Vue Router 사용법',
    content:
      'Vue Router를 사용하면 Vue.js 애플리케이션에서 페이지 이동을 쉽게 처리할 수 있습니다.',
  },
  {
    no: 8,
    title: '컴포넌트 기반 개발',
    content:
      'Vue.js에서는 컴포넌트를 사용하여 UI를 작은 단위로 쪼개서 관리할 수 있습니다.',
  },
  {
    no: 9,
    title: 'CSS와 SCSS 차이점',
    content: 'SCSS는 CSS의 확장된 버전으로 변수, 중첩, 믹스인 등을 지원합니다.',
  },
  {
    no: 10,
    title: 'Git과 GitHub 사용법',
    content:
      'Git은 버전 관리 시스템이며, GitHub는 이를 활용한 원격 저장소 플랫폼입니다.',
  },
]);

const selectPostNo = ref(null);
//content펼치는 함수
const clickToMenu = (no) => {
  if (selectPostNo.value === no) {
    selectPostNo.value = null;
  } else {
    selectPostNo.value = no;
  }
};
//content 닫는 함수
const closePost = () => {
  selectPostNo.value = null;
};
//새로운 게시글 추가
const addPost = (newPost) => {
  posts.value.push(newPost);
};
//게시글 삭제
const deletePost = (no) => {
  //findIndext(콜백) : 콜백함수가 true를 반환하는 첫번째 요소의 인덱스를 반환
  let index = posts.value.findIndex((item) => no === item.no);
  if (confirm('정말로 삭제하시겠습니까?')) {
    //splice(인덱스, 삭제할 요소의 갯수) : 인덱스부터 갯수만큼 배열의 요소를 삭제
    posts.value.splice(index, 1);
  }
};
//게시글 수정
const selectEditPostNo = ref(null);
const editingForm = ref({
  title: '',
  content: '',
});
const editPost = (post) => {
  selectEditPostNo.value = post.no;
  editingForm.value.title = post.title;
  editingForm.value.content = post.content;
};

//수정한 게시글 저장
const SavePost = (editpost) => {
  const target = posts.value.find((item) => item.no === selectEditPostNo.value);
  if (!target) return;

  target.title = editpost.title;
  target.content = editpost.content;

  selectEditPostNo.value = null;
};

//수정 중인 게시글 취소
const EditCancel = () => {
  selectEditPostNo.value = null;
};
</script>

<style></style>
