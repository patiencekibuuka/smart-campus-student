package ug.ac.uict.smartcampus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ug.ac.uict.smartcampus.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}