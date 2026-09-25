package ug.ac.uict.smartcampus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ug.ac.uict.smartcampus.model.Result;

public interface ResultRepository extends JpaRepository<Result, Long> {
}