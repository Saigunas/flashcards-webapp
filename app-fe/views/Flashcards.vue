<script setup>
  import { ref } from "vue";
</script>
<template>
 <div class="ag-format-container">
  <div class="ag-courses_box"><ul><h2 v-for="(Flashcards, i) in Flashcards" :key="i">
    <div class="ag-courses_item">
      <a href="#" class="ag-courses-item_link">
        <div class="ag-courses-item_bg">
        </div>
        <div class="ag-courses-item_title">
     {{ Flashcards }}
        </div>
      </a>
    </div>
 </h2></ul></div>
</div>
</template>
<script>
export default {
  data() {
    return {
      Flashcards: ['History', 'Eng','0'],
    };
  },
};
</script>
<style>
.ag-format-container {
  width: 1142px;
  margin: 0 auto;
  
}

template {
  background-color: #000;
}
.ag-courses_box {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: start;
  -ms-flex-align: start;
  align-items: flex-start;
  -ms-flex-wrap: wrap;
  flex-wrap: wrap;
  justify-content: center;
  text-align: center;
  padding: 30px 0;
}
.ag-courses_item {
  -ms-flex-preferred-size: calc(33.33333% - 30px);
  flex-basis: calc(33.33333% - 30px);

  margin: 0 95px 45px;
  overflow: hidden;

  border-radius: 28px;
}
.ag-courses-item_link {
  display: block;
  padding: 45px 400px;
  background-color: #121212;

  overflow: hidden;
  text-align: center;
  position: relative;
}
.ag-courses-item_link:hover,
.ag-courses-item_link:hover .ag-courses-item_date {
  text-decoration: none;
  color: #FFF;
}
.ag-courses-item_link:hover .ag-courses-item_bg {
  -webkit-transform: scale(10);
  -ms-transform: scale(10);
  transform: scale(10);
}
.ag-courses-item_title {
  min-height: 87px;
  margin: 0 0 25px;
  overflow: hidden;
  font-weight: bold;
  font-size: 30px;
  color: #FFF;

  z-index: 2;
  position: relative;
}
.ag-courses-item_date-box {
  font-size: 18px;
  color: #FFF;

  z-index: 2;
  position: relative;
}
.ag-courses-item_date {
  font-weight: bold;
  color: #f9b234;

  -webkit-transition: color .5s ease;
  -o-transition: color .5s ease;
  transition: color .5s ease
}
.ag-courses-item_bg {
  height: 128px;
  width: 128px;
  background-color: #f9b234;

  z-index: 1;
  position: absolute;
  top: -75px;
  right: -75px;

  border-radius: 50%;

  -webkit-transition: all .5s ease;
  -o-transition: all .5s ease;
  transition: all .5s ease;
}
.ag-courses_item:nth-child(6n) .ag-courses-item_bg {
  background-color: #4c49ea;
}
</style>