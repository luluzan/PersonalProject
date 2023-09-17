<script>

</script>

<template>
 <section id="contact" class="sec-contact">
    <div class="container">
      <h1>Hire me</h1>

      <hr />

      <div class="row">
        <div class="col-sm-4 col-sm-offset-4">
          <form class="center-block" action="#" method="post">
            <div class="form-group">
              <label class="sr-only" for="inputName">Full name</label>

              <input id="inputName" class="form-control" type="text" placeholder="Adam Smith" required />
            </div>

            <div class="form-group">
              <label for="inputMail" class="sr-only">Email Address</label>

              <input id="inputMail" class="form-control" type="email" placeholder="adam.smith@mail.com" required />
            </div>

            <div class="form-group">
              <label for="inputMessage" class="sr-only">Your Message</label>

              <textarea id="inputMessage" class="form-control" name="message" cols="30" rows="8" required></textarea>
            </div>

            <div class="form-group">
              <button class="btn btn-default center-block" type="submit" value="Hire me">Hire me</button>
            </div>
          </form>
        </div>
      </div>
    </div>
  </section>

</template>

<style scoped>

/*Contact*/

.sec-contact .form-control:focus {
  border-color: red;
  box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075), 0 0 8px rgba(173, 0, 0, .6);
}

.sec-contact .btn {
  padding: .5rem 1.75rem;
  background: #000;
  font-size: .95rem;
  color: #fff;
  

  &:hover,
  &:focus {
    background: red;
    border-color: darken(red, 10%);
  }
}

</style>
