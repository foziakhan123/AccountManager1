<template>
  <div class="hello">
   <br><br><br><br><br><br><br><br><br><br><br><br>
  <table style="width:100%">
  <tr>
    <th>Firstname</th>
    <th>Lastname</th>
    <th>AccountNumber</th>
  </tr>
</table>
  </div>
</template>
<script>
export default {
  name: 'AccountManager',
  data () {
    return {
      msg: 'Account Manager'
    }
  }
}
</script>
<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
