package com.priyanshu.studentcrud.service;

import com.priyanshu.studentcrud.model.Student;
import com.priyanshu.studentcrud.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

// Service layer that delegates business logic between controller and repository
@Service
public class StudentService {

    private final StudentRepository studentRepo;

    public StudentService(StudentRepository studentRepo) {
        this.studentRepo = studentRepo;
    }

    public void addStudent(Student student) {
        studentRepo.insertStudent(student);
    }

    public List<Student> listAll() {
        return studentRepo.getAllStudents();
    }

    public Student fetchById(int id) {
        return studentRepo.getStudentById(id);
    }

    public void modifyStudent(int id, Student student) {
        studentRepo.updateStudent(id, student);
    }

    public void removeStudent(int id) {
        studentRepo.deleteStudent(id);
    }
}
