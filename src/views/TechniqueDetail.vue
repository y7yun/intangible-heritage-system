<template>
  <div class="technique-detail">
    <h1>{{ technique.title }}</h1>
    <p>{{ technique.content }}</p>
    <div class="statistics">
      <p>Views: {{ technique.views }}</p>
      <p>Likes: {{ technique.likes }}</p>
      <p>Comments: {{ technique.comments }}</p>
    </div>
    <div class="actions">
      <button @click="likeTechnique">Like</button>
      <button @click="commentOnTechnique">Comment</button>
      <button @click="shareTechnique">Share</button>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      technique: {
        title: 'Technique Title',
        content: 'Full content of the technique goes here...',
        views: 0,
        likes: 0,
        comments: 0
      }
    };
  },
  methods: {
    likeTechnique() {
      this.technique.likes++;
      // Add logic to handle liking technique
    },
    commentOnTechnique() {
      // Logic to open comment modal
    },
    shareTechnique() {
      // Logic to share technique
    }
  }
};
</script>

<style scoped>
.technique-detail {
  padding: 20px;
  border: 1px solid #ccc;
  border-radius: 5px;
}
.statistics {
  margin-top: 20px;
}
.actions button {
  margin-right: 10px;
}
</style>
