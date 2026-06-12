package com.example.student.service;

import com.example.student.exception.StudentNotFoundException;
import com.example.student.model.Student;
import com.example.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
            .orElseThrow(() -> new StudentNotFoundException("Student not found with id: " + id));
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Long id, Student details) {
        Student student = getStudentById(id);
        student.setName(details.getName());
        student.setEmail(details.getEmail());
        student.setDepartment(details.getDepartment());
        student.setYear(details.getYear());
        student.setCgpa(details.getCgpa());
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        Student student = getStudentById(id);
        studentRepository.delete(student);
    }

    @Override
    public List<Student> getStudentsByDepartment(String department) {
        return studentRepository.findByDepartment(department);
    }

    @Override
    public List<Student> getStudentsByYear(int year) {
        return studentRepository.findByYear(year);
    }
}