<script>

</script>

<template>

</template>

<style scoped>

.contact-section{
  display: flex;
  justify-content: center;
  align-items: center;
}

.contact-section img{
  max-width: 40%;
  min-width: 200px;
}

.contact-section form{
  display: flex;
  flex-direction: column;
  text-align: center;
  width: 90%;
  margin: 0 5%;
  max-width: 500px;
}

.input-group{
  display: flex;
  flex-direction: column;
  margin: 20px 0;
}

.input-group label{
  padding: 10px 0;
  font-size: 1.5rem;
  color: rgba(0, 189, 126, 1);
}

.input-group input, select, textarea {
  min-height: 30px;
  border-radius: 10px;
  resize: vertical;
}

.form-submit {
  color: rgba(0, 189, 126, 1);
  font-size: 1.5rem;
  font-weight: bold;
  border-radius: 10px;
  border: solid 3px rgba(0, 189, 126, 1);
  width: 100px;
  margin: 0 calc(50% - 50px);
  cursor: pointer;
}

.form-submit:hover {
  background-color: transparent;
  box-shadow: 0 0 20px rgba(0, 189, 126, 1);
}

@media (max-width: 992px) {
  .contact-section {
    flex-direction: column;
  }
}

</style>
