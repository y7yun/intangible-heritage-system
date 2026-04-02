package com.example.intangibleheritage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.intangibleheritage.model.TeachingCourse;

@Repository
public interface TeachingCourseRepository extends JpaRepository<TeachingCourse, Long> {
    // Custom query methods can be defined here
}