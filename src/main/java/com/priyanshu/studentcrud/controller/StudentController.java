package com.priyanshu.studentcrud.controller;
// import com.priyanshu.studentcrud.model.Student;
import com.priyanshu.studentcrud.model.Student;
import com.priyanshu.studentcrud.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// REST controller that exposes CRUD endpoints for student records
@RestController
@RequestMapping("/students")
@CrossOrigin
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // POST /students - insert a new student
    @PostMapping
    public String addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return "Student created successfully";
    }

    // GET /students - retrieve all student records
    @GetMapping
    public List<Student> listAllStudents() {
        return studentService.listAll();
    }

    // GET /students/{id} - retrieve a single student by id
    @GetMapping("/{id}")
    public Student fetchStudentById(@PathVariable int id) {
        return studentService.fetchById(id);
    }

    // PUT /students/{id} - update an existing student
    @PutMapping("/{id}")
    public String modifyStudent(@PathVariable int id, @RequestBody Student student) {
        studentService.modifyStudent(id, student);
        return "Student updated successfully";
    }

    // DELETE /students/{id} - remove a student record
    @DeleteMapping("/{id}")
    public String removeStudent(@PathVariable int id) {
        studentService.removeStudent(id);
        return "Student deleted successfully";
    }
}