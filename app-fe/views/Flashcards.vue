<template>
 <!--  <div class="background-container bg-con bg-dark">
    <div class="container my-5">
      <div class="d-flex justify-content-between align-items-center mb-4">
        <h2 class="text-light">Your flashcard sets!</h2>
        <router-link class="btn btn-success" :to="{name: 'AddFlashcardSet'}"> <i class="bi bi-plus"></i> Add a Flashcard Set</router-link>
      </div>
      <div class="row row-cols-1 row-cols-md-3 g-4">
     <div v-if="this.sets.user_id = this.user.id">
        <div v-for="(sets, index) in this.sets" :key="index" class="col"> 
          <div class="card bg-white text-dark">
            <div class="card-body">
              <h5 class="card-title text-dark">{{ sets.name }}</h5>
              <div class="d-flex justify-content-between align-items-center">
                <router-link to="edit" class="btn btn-outline-info mx-2">
                  <i class="bi bi-pencil-square"></i> Edit
                </router-link>
                <router-link to="LearnFlashcard" class="btn btn-outline-warning mx-2">
                  <i class="bi bi-lightbulb"></i> Learn
                </router-link>
                <button type="button" class="btn btn-outline-danger mx-2" @click="deleteSet(sets.id)">
                  <i class="bi bi-trash"></i> Delete
                </button>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
</div>
  </div>-->
<div class="background-container bg-con bg-dark">
    <div class="container my-5">
      <div class="d-flex justify-content-between align-items-center mb-4">
        <h2 class="text-light">Your flashcard sets!</h2>
        <router-link class="btn btn-success" :to="{name: 'AddFlashcardSet'}"> <i class="bi bi-plus"></i> Add a Flashcard Set</router-link>
      </div>
      <div class="row row-cols-1 row-cols-md-3 g-4">
        <div v-for="(set, index) in sets" :key="index" class="col">
          <div class="card bg-white text-dark" >
            <div class="card-body">
              <h5 class="card-title text-dark">{{ set.title }}</h5>
              <p class="card-text text-dark">{{ set.description }}</p>
              <div class="d-flex justify-content-between align-items-center">
                <router-link to="edit" class="btn btn-outline-info mx-2">
                  <i class="bi bi-pencil-square"></i> Edit
                </router-link>
                <router-link to="LearnFlashcard" class="btn btn-outline-warning mx-2">
                  <i class="bi bi-lightbulb"></i> Learn
                </router-link>
                <button type="button" class="btn btn-outline-danger mx-2" @click="deleteSet(index)">
                  <i class="bi bi-trash"></i> Delete
                </button>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import axios from 'axios'
export default {
 data() {
    return {
      sets: [
        { title: 'Animals', description: 'Click on this set to start learning!' },
        { title: 'History', description: 'Click on this set to start learning!' },
      ],
      /*user:null,
  sets:[]*/
    }
  },
  /*async users(){
  const response =  await axios.get('http://localhost:5069/user',{
      headers:{
        Authorization: localStorage.getItem('token')
      },
      }); 
this.user =response.data;
  },

mounted(){
this.getFlascardsSets();
},*/
  methods: {
 /* getFlascardsSets(){
  axios.get('http://localhost:5069/flashcardset',{


 }).then(res =>{
  this.sets=res.data.sets
  console.log(res)
 });
  },*/

    deleteSet(index) {
      /*if(confirm('Delete this Set?')){
axios.delete("http://localhost:5069/flashcardset/${index}")
.this(res =>{
this.getFlascardsSets();
})
      }*/
      this.sets.splice(index, 1);
    },
    startLearning(index) {
      this.$router.push({ name: 'LearnFlashcard', params: { setIndex: index } });
    }
  }
}
</script>

<style>
.ag-format-container {
  width: 100%;
  height: 100%;
  margin: 0 auto;
}

.card {
  transition: transform 0.2s ease;
  cursor: pointer;
}

.card:hover {
  transform: scale(1.05);
}

</style>

