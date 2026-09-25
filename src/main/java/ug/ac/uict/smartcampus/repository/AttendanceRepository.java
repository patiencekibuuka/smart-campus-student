package ug.ac.uict.smartcampus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ug.ac.uict.smartcampus.model.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
}