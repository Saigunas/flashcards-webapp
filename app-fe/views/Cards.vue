<script setup>
  import { ref } from "vue";

</script>

<template>
<div class="ag-format-container"><ul><h2 v-if="(Cardsetquest, counter) in Cardsetquest" :key=counter>
{{Cardsetquest}}
</h2></ul>
    </div>
<div class="ag-format-container">
  <div class="ag-courses_box">
    <div class="ag-courses_item">
      <a href="#" class="ag-courses-item_link">
        <div class="ag-courses-item_bg">
        </div>
        <div class="ag-courses-item_title">

    <button @click="counter++">Next Cards</button>
<button @click="counter--">Previous Card</button>
        </div>
      </a>
    </div>
</div>
</div>

<p>Count is: {{ counter }}</p>
</template>

<script >
export default {
  data() {
    return {
      Cardsetquest: ['Ka', 'Eng','0'],
      Cardsetanws:['Da','Gne','10'],
      counter:0
    };
  },
};
</script>
<style>

button{
  background-color: green;
  color: green;
  z-index: 2;
}
</style>