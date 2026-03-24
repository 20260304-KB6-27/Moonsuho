<template>
  <li><input type="checkbox" v-model="checked" />옵션</li>
</template>

<!-- setup 안썼을 때 -->
<!-- <script>
import { ref } from 'vue';

export default {
  name: 'CheckboxItem',
  setup() {
    const checked = ref(false);
    return { checked };
  },
};
</script> -->
<script setup>
import { ref } from 'vue';
const checked = ref(false);
</script>

<style lang="scss" scoped></style>
