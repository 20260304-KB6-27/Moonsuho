<template>
  <div>
    <h2>비동기 컴포넌트</h2>
    <AsyncComp></AsyncComp>
  </div>
</template>

<script setup>
import { defineAsyncComponent } from 'vue';
import ErrorComp from './components/ErrorComp.vue';
import LoadingComp from './components/LoadingComp.vue';

//옵션 없이 사용
// const AsyncComp = defineAsyncComponent(
//   () => import('./components/AsyncComponent.vue'),
// );
/*
defineAsyncComponet 사용 시점
-초기 로딩 속도 개선이 필요할 때
- 무겁거나(차트, 데이터) 자주 확인하지 않는 컴포넌트
*/

//옵션
const AsyncComp = defineAsyncComponent({
  loader: () =>
    new Promise((reslove) => {
      setTimeout(() => {
        reslove(import('./components/AsyncComponent.vue'));
      }, 3000);
    }),

  loadingComponent: LoadingComp, // delay 이후 로딩 중에 표시
  errorComponent: ErrorComp, //timeout 초과 또는 오류 발생 시 표시
  delay: 200,
  timeout: 3000, // 3초 지나면 ErrorComponent
});
</script>

<style scoped></style>
