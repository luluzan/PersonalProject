<script setup>
import DataService from '../services/DataService.js' 
import { ref, onMounted } from 'vue'

const projectsList = ref([]) 

async function fetchProjects() {
  projectsListList.value = await dataService.getProjects() 
}

onMounted(fetchProjects)
</script>

<template>
  <div>
    <h1>Portfolio</h1> 
    <div v-for="projectItem in projectsList" :key="projectItem.id">
      {{ projects.title }} 
      <img :src="projectItem.imgUrl" /> 
    </div> 
  </div>
</template>