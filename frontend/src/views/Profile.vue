<template>
  <div class="profile">
    <h1>User Profile</h1>
    <div class="tabs">
      <button @click="currentTab = 'overview'">Overview</button>
      <button @click="currentTab = 'myTechniques'">My Techniques</button>
      <button @click="currentTab = 'myCourses'">My Courses</button>
      <button @click="currentTab = 'settings'">Settings</button>
    </div>
    <div class="tab-content">
      <div v-if="currentTab === 'overview'">
        <h2>Overview</h2>
        <p>Information about the user.</p>
      </div>
      <div v-if="currentTab === 'myTechniques'">
        <h2>My Techniques</h2>
        <p>List of techniques the user has created or learned.</p>
      </div>
      <div v-if="currentTab === 'myCourses'">
        <h2>My Courses</h2>
        <p>Courses taken by the user.</p>
      </div>
      <div v-if="currentTab === 'settings'">
        <h2>Settings</h2>
        <p>User settings and preferences.</p>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      currentTab: 'overview'
    };
  }
};
</script>

<style scoped>
.profile {
  font-family: Arial, sans-serif;
}
.tabs {
  display: flex;
  justify-content: space-around;
}
.tab-content {
  margin-top: 20px;
}
</style>