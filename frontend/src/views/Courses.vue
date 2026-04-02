<template>
  <div class="courses-grid">
    <CourseCard v-for="course in courses" :key="course.id" :course="course" />
  </div>
</template>

<script>
import CourseCard from '../components/CourseCard.vue';

export default {
  name: 'Courses',
  components: {
    CourseCard
  },
  data() {
    return {
      courses: []
    };
  },
  mounted() {
    this.fetchCourses();
  },
  methods: {
    async fetchCourses() {
      try {
        const response = await fetch('API_ENDPOINT_HERE'); // Replace with actual API endpoint
        this.courses = await response.json();
      } catch (error) {
        console.error('Error fetching courses:', error);
      }
    }
  }
};
</script>

<style scoped>
.courses-grid {
  display: grid;
  grid-template-columns: repeat(auto-fill, minmax(250px, 1fr));
  gap: 20px;
}
</style>
