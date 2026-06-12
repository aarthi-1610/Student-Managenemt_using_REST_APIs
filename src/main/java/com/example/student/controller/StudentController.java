package com.example.student.controller;

import com.example.student.model.Student;
import com.example.student.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "*")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // GET all students
    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    // GET by ID
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.getStudentById(id));
    }

    // POST - create student
    @PostMapping
    public ResponseEntity<Student> createStudent(@Valid @RequestBody Student student) {
        return new ResponseEntity<>(studentService.createStudent(student), HttpStatus.CREATED);
    }

    // PUT - update student
    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(
            @PathVariable Long id,
            @Valid @RequestBody Student student) {
        return ResponseEntity.ok(studentService.updateStudent(id, student));
    }

    // DELETE student
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return ResponseEntity.ok("Student deleted successfully!");
    }

    // GET by department
    @GetMapping("/department/{dept}")
    public ResponseEntity<List<Student>> getByDepartment(@PathVariable String dept) {
        return ResponseEntity.ok(studentService.getStudentsByDepartment(dept));
    }

    // GET by year
    @GetMapping("/year/{year}")
    public ResponseEntity<List<Student>> getByYear(@PathVariable int year) {
        return ResponseEntity.ok(studentService.getStudentsByYear(year));
    }
}