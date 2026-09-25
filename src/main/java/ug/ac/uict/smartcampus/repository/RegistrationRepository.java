package ug.ac.uict.smartcampus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ug.ac.uict.smartcampus.model.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
}