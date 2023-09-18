<template>
  <h1>About Me</h1>
  <section class="about-section">    
    <div class="about-group">
      <div class="about-image">
        <img src="https://images.unsplash.com/photo-1493723843671-1d655e66ac1c?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1170&q=80" alt="">
      </div>
      <div class="about-text">
        <p>
          
        </p>
        <br>
        <p>
          Lorem ipsum dolor sit amet consectetur adipisicing elit. Commodi
          aspernatur earum beatae at aperiam non molestias nam mollitia
          delectus corrupti itaque tempore ut facilis quidem dolor, iusto
          impedit consequatur! Similique?
        </p>
        <br>
       >
      </div>
    </div>
  </section>
</template>

<style scoped>

.about-image{
  animation: 1s slideIn linear infinite alternate;
  animation-iteration-count: 1;
}

.about-text{
  animation: 1s revealText linear infinite alternate;
  animation-iteration-count: 1;
}

@keyframes slideIn{
  0% {
    left: -25%;
  }
  100% {
    left: 0;
  }
}

@keyframes revealText{
  0% {
    opacity: 0;
  }
  100% {
    opacity: 1;
  }
}

.about-group{
  display: flex;
  align-items: center;
  justify-content: center;
  width: 90%;
  margin: 5%;
}

.about-image{
  width: 50%;
}

img{
  width: 100%;
  border-radius: 20px;
  box-shadow: 0 0 20px #fabada;
}

.about-text{
  margin-left: 5%;
  max-width: 45%;
  text-align: justify;
}

</style>
