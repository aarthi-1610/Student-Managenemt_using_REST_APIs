package com.example.student.repository;

import com.example.student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByDepartment(String department);
    List<Student> findByYear(int year);
    List<Student> findByCgpaGreaterThanEqual(double cgpa);
}