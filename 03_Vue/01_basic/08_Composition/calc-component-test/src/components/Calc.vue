<template>
  <div>
    x: <input type="text" v-model.number="x" /> <br />
    y:<input type="text" v-model.number="y" /><br />
  </div>
</template>

<script>
import { ref } from 'vue';
//setup 안썼을 때 export해줘야함
export default {
  name: 'Calc',

  setup() {
    const x = ref(10);
    const y = ref(10);
    return { x, y };
  },
};
</script>

<style scoped></style>
