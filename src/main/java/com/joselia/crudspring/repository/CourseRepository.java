package com.joselia.crudspring.repository;

import com.joselia.crudspring.model.Course;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
