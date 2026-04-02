package com.example.intangibleheritage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/courses")
public class TeachingCourseController {

    @Autowired
    private TeachingCourseService teachingCourseService;

    @GetMapping
    public ResponseEntity<List<TeachingCourse>> getAllCourses() {
        List<TeachingCourse> courses = teachingCourseService.findAll();
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TeachingCourse> getCourseById(@PathVariable Long id) {
        Optional<TeachingCourse> course = teachingCourseService.findById(id);
        if (course.isPresent()) {
            return new ResponseEntity<>(course.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<TeachingCourse> createCourse(@RequestBody TeachingCourse teachingCourse) {
        TeachingCourse createdCourse = teachingCourseService.save(teachingCourse);
        return new ResponseEntity<>(createdCourse, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TeachingCourse> updateCourse(@PathVariable Long id, @RequestBody TeachingCourse teachingCourse) {
        TeachingCourse updatedCourse = teachingCourseService.update(id, teachingCourse);
        if (updatedCourse != null) {
            return new ResponseEntity<>(updatedCourse, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCourse(@PathVariable Long id) {
        if (teachingCourseService.delete(id)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}