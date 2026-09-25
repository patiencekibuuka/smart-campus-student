package ug.ac.uict.smartcampus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ug.ac.uict.smartcampus.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}