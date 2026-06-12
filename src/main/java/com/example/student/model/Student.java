package com.example.student.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required")
    private String name;

    @Email(message = "Invalid email format")
    @NotBlank(message = "Email is required")
    @Column(unique = true)
    private String email;

    @NotBlank(message = "Department is required")
    private String department;

    @Column(name = "study_year")   
    @Min(value = 1, message = "Year must be 1 to 4")
    @Max(value = 4, message = "Year must be 1 to 4")
    private int year;

    @DecimalMin(value = "0.0", message = "CGPA minimum 0.0")
    @DecimalMax(value = "10.0", message = "CGPA maximum 10.0")
    private double cgpa;

    // Constructors
    public Student() {}

    public Student(String name, String email, String department, int year, double cgpa) {
        this.name = name;
        this.email = email;
        this.department = department;
        this.year = year;
        this.cgpa = cgpa;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public double getCgpa() { return cgpa; }
    public void setCgpa(double cgpa) { this.cgpa = cgpa; }
}