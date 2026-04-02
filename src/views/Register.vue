<template>
  <div class="register">
    <h1>Register</h1>
    <form @submit.prevent="handleSubmit">
      <div>
        <label for="username">Username:</label>
        <input type="text" id="username" v-model="username" required />
      </div>
      <div>
        <label for="email">Email:</label>
        <input type="email" id="email" v-model="email" required />
      </div>
      <div>
        <label for="password">Password:</label>
        <input type="password" id="password" v-model="password" required />
      </div>
      <div>
        <label for="userType">User Type:</label>
        <select id="userType" v-model="userType" required>
          <option value="admin">Admin</option>
          <option value="member">Member</option>
        </select>
      </div>
      <button type="submit">Register</button>
    </form>
  </div>
</template>

<script>
export default {
  data() {
    return {
      username: '',
      email: '',
      password: '',
      userType: '',
    };
  },
  methods: {
    handleSubmit() {
      // Handle form submission
      console.log({ username: this.username, email: this.email, password: this.password, userType: this.userType });
    },
  },
};
</script>

<style scoped>
.register {
  max-width: 400px;
  margin: auto;
}
form div {
  margin-bottom: 15px;
}
</style>
