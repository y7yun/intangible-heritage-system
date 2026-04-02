<template>
  <div class="course-detail">
    <h1>Course Detail</h1>
    <div class="course-info">
      <p><strong>Course Title:</strong> Example Course Title</p>
      <p><strong>Description:</strong> This is an example course description providing details about the course.</p>
      <p><strong>Instructor:</strong> John Doe</p>
      <p><strong>Duration:</strong> 10 Weeks</p>
      <p><strong>Enrollment Fee:</strong> $200</p>
    </div>
    <button class="enroll-button">Enroll Now</button>
  </div>
</template>

<script>
export default {
  name: 'CourseDetail',
};
</script>

<style scoped>
.course-detail {
  padding: 20px;
  border: 1px solid #ccc;
  border-radius: 5px;
}

.enroll-button {
  background-color: #4CAF50;
  color: white;
  padding: 10px 20px;
  border: none;
  border-radius: 5px;
  cursor: pointer;
}

.enroll-button:hover {
  background-color: #45a049;
}
</style>
