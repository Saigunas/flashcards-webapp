<script setup>
  import { ref } from "vue";
  import Home from "./components/Home.vue"
  import Login from "./components/Login.vue"
  import Register from "./components/Register.vue"
  import About from "./components/About.vue"

  let activeTab = ref('Home');

</script>


<template>
  <div id="app-body">
    <nav class="navbar navbar-dark bg-dark navbar-expand-lg navbar-light bg-light">
      <a class="navbar-brand ps-4" href="#">
        Flashcard app
      </a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
  <div class="navbar-nav">
    <a @click="activeTab = 'Home'" class="nav-item nav-link active" href="#"><i class="bi bi-house-door-fill me-2"></i>Home</a>
    <a @click="activeTab = 'Something'" class="nav-item nav-link" href="#"><i class="bi bi-bar-chart-line-fill me-2"></i>Something</a>
    <a @click="activeTab = 'About'" class="nav-item nav-link" href="#"><i class="bi bi-info-circle-fill me-2"></i>About</a>
  </div>
</div>
  <div class="navbar-nav mx-4 ml-auto">
    <a @click="activeTab = 'Login'" class="loginMenu nav-item nav-link" href="#"><i class="bi bi-info-circle-fill me-2"></i>Login</a>
    <a @click="activeTab = 'Register'" class="loginMenu nav-item nav-link" href="#"><i class="bi bi-info-circle-fill me-2"></i>Register</a>
</div>
      
    </nav>
    

    <home v-if="activeTab === 'Home'"/>
  

    <div v-if="activeTab === 'Something'">
      Something
    </div>

    <Login v-if="activeTab === 'Login'"/>
    
    <Register v-if="activeTab === 'Register'"/>

    <About v-if="activeTab === 'About'"/>


    <footer class="footer bg-dark text-white py-2">
      <div class="container">
        <div class="row">
          <div class="col-md-6 d-flex align-items-center gap-2">
            <a href="https://github.com/Saigunas/flashcards-webapp"><i class="bi bi-github h3 m-0"></i></a>
            <span>Flashcard App</span>
          </div>
          <div class="col-md-6 d-flex align-items-center justify-content-end">
            <span class="footer-information" style="margin-left: auto">Project was made by Karolis, Gvidas, Saigunas.</span>
          </div>
        </div>
      </div>
    </footer>
  </div>
</template>


<!-- Don't use any styles, look  for bootstrap classes -->
<style scoped>

#app-body {
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  min-height: 100vh;
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  overflow: hidden;
}

</style>
