<template>
  <nav class="navbar navbar-expand-md bg-black navbar-dark mt-2">
    <span class="navbar-brand">이날치(LeeNaChi)</span>
    <button class="navbar-toggler" type="button" @click="changeIsNavShow">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div :class="navClass">
      <ul class="navbar-nav">
        <li class="nav-item">
          <RouterLink class="nav-link" to="/">홈</RouterLink>
        </li>
        <li class="nav-item">
          <RouterLink class="nav-link" to="/about">소개</RouterLink>
        </li>
        <li class="nav-item">
          <RouterLink class="nav-link" to="/members">멤버</RouterLink>
        </li>
        <li class="nav-item">
          <RouterLink class="nav-link" to="/videos">영상</RouterLink>
        </li>
      </ul>
    </div>
  </nav>
</template>

<script>
import { RouterLink } from 'vue-router';
import { reactive, computed } from 'vue';
export default {
  setup() {
    const state = reactive({ isNavShow: false });
    const navClass = computed(() => {
      return state.isNavShow
        ? 'collapse navbar-collapse show'
        : 'collapse navbar-collapse';
    });
    const changeIsNavShow = () => {
      state.isNavShow = !state.isNavShow;
    };
    return { state, changeIsNavShow, navClass };
  },
};
</script>

<style></style>
