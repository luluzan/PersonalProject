<script>
window.addEventListener("load", () => {
  window.setTimeout(() => {
    const el = document.querySelector("[data-animation]");
    const { animation } = el.dataset; // makepbvisible
    el.classList.add(animation);
  }, 300);
});



</script>

<template>
 <section class="skills">
  <div class="skills-container">
    <div>
      <div class="tab-content">
        <h2 class="heading-2">
          Skills</h2>
        <div class="tab-content-grid" data-animation="makepbvisible">
          <div>
            <div class="div-skills-text">
              <div>GAME DESIGN</div>
              <div>90%</div>
            </div>
            <div class="progress-wrapper">
              <div class="progress-bar _90"></div>
            </div>
          </div>
          <div>
            <div class="div-skills-text">
              <div>SOUND DESIGN</div>
              <div>80%</div>
            </div>
            <div class="progress-wrapper">
              <div class="progress-bar _80"></div>
            </div>
          </div>
          <div>
            <div class="div-skills-text">
              <div>PRODUCTION</div>
              <div>65%</div>
            </div>
            <div class="progress-wrapper">
              <div class="progress-bar _65"></div>
            </div>
          </div>

          <div>
            <div class="div-skills-text">
              <div>MUSIC COMPOSITION</div>
              <div>60%</div>
            </div>
            <div class="progress-wrapper">
              <div class="progress-bar _60"></div>
            </div>
          </div>
          <div>
            <div class="div-skills-text">
              <div>MARKETING</div>
              <div>45%</div>
            </div>
            <div class="progress-wrapper">
              <div class="progress-bar _45"></div>
            </div>
          </div>
        </div>
      </div>
    </div>
      </div>
      </section>
</template>

<style>
@import url('https://fonts.googleapis.com/css2?family=Oswald:wght@700&family=Poppins:wght@400&display=swap');

* {
  box-sizing: border-box;
  margin: 0;
  padding: 0;
}

body {
  background-color: var(--clr-bg);
  color: #333;
  font: 400 1.1rem/1.6 'Poppins', sans-serif;
  min-height: 100vh;
  overflow-y: scroll;
  overflow-x: hidden;
}

/*****************************
    .skills section styles
 ****************************/
.heading-2 {
  font-family: 'Oswald', sans-serif;
  font-size: 2.25em;
  font-weight: 700;
  letter-spacing: 3px;
  line-height: 1.5;
  margin-bottom: 0.5rem;
  text-transform: uppercase;
}

.skills {
  background-color: #ebebeb;  
  min-height: 100vh;
  padding: 20px;
}

.skills-container {
  margin: 0 auto;
  max-width: 560px;
}

.tab-content {
  background-color: #fff;
  border-radius: 6px;
  box-shadow: 0 0 8px 3px rgba(6, 15, 24, 0.06);
  color: #3e4440;
  font-weight: 400;
  margin-bottom: 0;
  padding: 16px;  
  position: relative;
  z-index: 1;
}

.tab-content-grid {
  display: grid;
  grid-template-columns: 1fr;
  grid-gap: 16px;
  animation: .8s forwards;
}

.div-skills-text {
  display: flex;
  margin-bottom: 4px;
  justify-content: space-between;
}

.progress-wrapper {
  background-color: #f5f5f5;
  border: 1px none transparent;
  border-radius: 6px;
  box-shadow: inset 0 0 1px 2px rgba(0, 0, 0, 0.1);
  height: 8px;
  width: 100%;
  overflow: hidden;
}

.progress-bar {
  background-color: #2cb617;
  border: 1px none transparent;
  border-radius: 6px;
  box-shadow: inset 0 0 0 0 rgba(0, 0, 0, 0.15);
  height: 100%;
  transform: scaleX(var(--pbscale, 0));
  transform-origin: left center;
  transition: transform .5s ease-out var(--pbdelay, 0);
}

.makepbvisible ._90 {
  --pbscale: .9;
  --pbdelay: .4s;
}
.makepbvisible ._80 {
  --pbscale: .8;
  --pbdelay: .6s;
}
.makepbvisible ._65 {
  --pbscale: .65;
  --pbdelay: .8s;
}
.makepbvisible ._60 {
  --pbscale: .6;
  --pbdelay: 1s;
}
.makepbvisible ._45 {
  --pbscale: .45;
  --pbdelay: 1.2s;
}

.footer {
  font-size: 1rem;
  margin-top: 2em;
  padding: 0 20px;
}

.footer a {
  color: #117002;
}
</style>
