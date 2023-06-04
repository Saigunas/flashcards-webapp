<script setup>
  import { ref } from "vue";
</script>

<template>
  <div class="about-container">
    <section class="vh-100">
  <div class="container-fluid h-custom">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-md-9 col-lg-6 col-xl-5">
        <img src="https://images.unsplash.com/photo-1588702547919-26089e690ecc?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1770&q=80"
          class="img-fluid" alt="Image">
      </div>
      <div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
        <form @submit.prevent="handleSubmit">
          <div class="d-flex flex-row align-items-center justify-content-center justify-content-lg-start">
            <p class="lead fw-normal mb-0 me-3">Register to our Flashcards App!</p>
          </div>

          <div class="divider d-flex align-items-center my-4">
          </div>

          <div class="form-outline mb-4">
            <label class="form-label" for="firstName">First Name</label>
            <input type="text" id="firstName" v-model="firstName" class="form-control form-control-lg"
              placeholder="Enter your First Name..."  required/>
          </div>

          <div class="form-outline mb-4">
            <label class="form-label" for="lastName">Last Name</label>
            <input type="lastName" id="lastName" v-model="lastName" class="form-control form-control-lg"
              placeholder="Enter your Last Name..." required/>
          </div>
                  <div class="form-outline mb-4">
            <label class="form-label" for="username">Username</label>
            <input type="text" id="username" v-model="userName" class="form-control form-control-lg"
              placeholder="Enter your Username..."  required/>
          </div>

          <div class="form-outline mb-3">
            <label class="form-label" for="password">Password</label>
            <input type="password" id="password" v-model="password" class="form-control form-control-lg"
             placeholder="Enter password..." required/>
          </div>

          <div class="text-center text-lg-start mt-4 pt-2">
            <button  type="submit" class="btn btn-primary btn-lg" style="padding-left: 2.5rem; padding-right: 2.5rem;">Register</button>
            <p class="small fw-bold mt-2 pt-1 mb-0">Have an account already? <router-link class="link-danger" :to="{name: 'Login'}">Take me to the Login page!</router-link>
            </p>
          </div>
        </form>
      </div>
    </div>
  </div>
</section>
  </div>
</template>
<script>
import axios from 'axios'
export default{
  data(){
    return {
      firstName:'',
      lastName:'',
      userName:'',
      password:''
    }
  },
  methods:{
    handleSubmit(){
      const data={
        firstName:this.firstName,
        lastName:this.lastName,
        userName:this.userName,
        password:this.password
      }
     axios.post('http://localhost:5069/auth/register',data)
     
this.$router.push('/login');
    },

   }
  }
</script>

<style>
.divider:after,
.divider:before {
content: "";
flex: 1;
height: 1px;
background: #eee;
}
.h-custom {
height: calc(100% - 73px);
}
</style>