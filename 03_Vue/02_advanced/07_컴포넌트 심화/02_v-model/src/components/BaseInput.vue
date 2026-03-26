<template>
  <div>
    <label>{{ label }}</label>
    <input
      type="type"
      :value="modelValue"
      :placeholder="placeholder"
      @input="emit('update:modelValue', $event.target.value)"
    />
  </div>
</template>

<script setup>
const props = defineProps(['modelValue', 'label', 'placeholder', 'type']);
// update:modelValue 에밋 선언
// update:모델이름 규칙을 지켜야 v-model과 연동됨
const emit = defineEmits(['update:modelValue']);
</script>

<style scoped></style>
