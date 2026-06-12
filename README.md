# 🎓 Student Management System - REST API

A fully functional **Student Management System** built using **Spring Boot** following RESTful API architecture. The application provides complete CRUD operations for managing student records along with filtering, validation, and exception handling.

---

## 📌 Features

* Add new student records
* View all students
* View student by ID
* Update student information
* Delete student records
* Filter students by department
* Filter students by academic year
* Input validation using Bean Validation
* Global exception handling
* Layered architecture (Controller → Service → Repository → Model)
* H2 in-memory database integration
* API testing using Postman

---

## 🛠️ Tech Stack

| Technology        | Purpose               |
| ----------------- | --------------------- |
| Java 17           | Programming Language  |
| Spring Boot 3.x   | Backend Framework     |
| Spring Data JPA   | Database Operations   |
| H2 Database       | In-Memory Database    |
| Spring Validation | Input Validation      |
| Maven             | Dependency Management |
| Postman           | API Testing           |

---

## 📁 Project Structure

```text
student-management/
│
├── src/
│   └── main/
│       ├── java/com/example/student/
│       │
│       ├── controller/
│       │   └── StudentController.java
│       │
│       ├── service/
│       │   ├── StudentService.java
│       │   └── StudentServiceImpl.java
│       │
│       ├── repository/
│       │   └── StudentRepository.java
│       │
│       ├── model/
│       │   └── Student.java
│       │
│       ├── exception/
│       │   ├── StudentNotFoundException.java
│       │   └── GlobalExceptionHandler.java
│       │
│       └── StudentManagementApplication.java
│
├── src/main/resources/
│   └── application.properties
│
├── pom.xml
│
└── README.md
```

---

## 🚀 How to Run

### Prerequisites

* Java 17+
* Maven 3.6+
* STS / IntelliJ IDEA

### Clone Repository

```bash
git clone https://github.com/aarthi-1610/student-management-system.git
```

### Navigate to Project

```bash
cd student-management-system
```

### Run Application

```bash
mvn spring-boot:run
```

Or

```text
Right Click Project
→ Run As
→ Spring Boot App
```

Application starts at:

```text
http://localhost:8080
```

---

## 📡 REST API Endpoints

Base URL:

```text
http://localhost:8080/api/students
```

| Method | Endpoint                        | Description          |
| ------ | ------------------------------- | -------------------- |
| GET    | /api/students                   | Get all students     |
| GET    | /api/students/{id}              | Get student by ID    |
| POST   | /api/students                   | Create student       |
| PUT    | /api/students/{id}              | Update student       |
| DELETE | /api/students/{id}              | Delete student       |
| GET    | /api/students/department/{dept} | Filter by department |
| GET    | /api/students/year/{year}       | Filter by year       |

---

## 📝 Sample Request

### Create Student

**POST** `/api/students`

```json
{
  "name": "John",
  "email": "john@example.com",
  "department": "AI and Data Science",
  "year": 4,
  "cgpa": 9.11
}
```

### Response

```json
{
  "id": 1,
  "name": "John",
  "email": "john@example.com",
  "department": "AI and Data Science",
  "year": 4,
  "cgpa": 9.11
}
```

---

## ❌ Error Response Example

### Student Not Found

```json
{
  "error": "Student not found with id: 5"
}
```

### Validation Error

```json
{
  "name": "Name is required",
  "email": "Invalid email format"
}
```

---

## 🗄️ H2 Database Console

Open browser:

```text
http://localhost:8080/h2-console
```

Use:

```text
JDBC URL : jdbc:h2:mem:studentdb
Username : sa
Password : (leave blank)
```

---

## ✅ Validation Rules

| Field      | Validation           |
| ---------- | -------------------- |
| name       | Not Blank            |
| email      | Valid Email Format   |
| department | Not Blank            |
| year       | Between 1 and 4      |
| cgpa       | Between 0.0 and 10.0 |

---

## 🧪 API Testing

Use Postman to test all endpoints.

Steps:

1. Open Postman
2. Select HTTP Method
3. Enter Endpoint URL
4. Choose Body → Raw → JSON
5. Send Request
6. Verify Response

---

## 🎯 Learning Outcomes

Through this project, you can learn:

* REST API Development
* Spring Boot Fundamentals
* CRUD Operations
* Spring Data JPA
* Bean Validation
* Exception Handling
* Layered Architecture
* H2 Database Integration
* API Testing using Postman

---

