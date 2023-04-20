<template>
  <div class="ag-format-container bg-dark">
    <div class="container my-5">
      <div class="d-flex justify-content-between align-items-center mb-4">
      <h2 class="text-light">Your flashcard sets!</h2>
        <router-link class="btn btn-success" :to="{name: 'Login'}"> <i class="bi bi-plus"></i> Add a Flashcard</router-link>
    </div>
      <div class="row row-cols-1 row-cols-md-3 g-4">
        <div class="col">
          <div class="card bg-white text-dark">
            <div class="card-body">
              <h5 class="card-title text-dark">Animals</h5>
              <p class="card-text text-dark">Click on this set, to start learning!</p>
              <div class="d-flex justify-content-between align-items-center">
                <button type="button" class="btn btn-outline-info">
                  <i class="bi bi-pencil-square"></i> Edit
                </button>
                <button type="button" class="btn btn-outline-danger">
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

<style>
.ag-format-container {
  width: 100%;
  height: 100%;
  margin: 0 auto;
}

.card {
  transition: transform 0.2s ease;
}

.card:hover {
  transform: scale(1.05);
}

</style>
