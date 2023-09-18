<script setup>
import Dataservice from '../services/Dataservice.js' 
import { ref, onMounted } from 'vue'

const portfolio = ref(null) 

async function fetchPortfolio() {
  portfolio.value = await Dataservice.getPortfolio() 
}

onMounted(fetchPortfolio)


console.log(portfolio)
</script>

<template>
  <div class="portf_list">
    <h1>Mis Proyectos</h1>
    <div v-if="portfolio">
      <ul>
        <li v-for="item in portfolio.data" :key="item.id">
          <img :src="item.imgUrl" />
          <h2>{{ item.title }}</h2>
          <p>{{ item.description }}</p>
          <a :href="item.url" target="_blank">Ver más</a>

        </li>
      </ul>
    </div>
  </div>
</template>

<style scoped>

.portf_list{
    margin: 10rem 2rem;
}
  .portf_list ul {
  list-style: none; 
  
}

.portf_list li {
  margin-bottom: 20px; /* Espacio entre elementos de la lista */
 }



</style>