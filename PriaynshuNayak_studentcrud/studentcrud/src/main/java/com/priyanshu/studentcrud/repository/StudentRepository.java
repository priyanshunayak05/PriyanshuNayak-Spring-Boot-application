package com.priyanshu.studentcrud.repository;

import com.priyanshu.studentcrud.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

// Repository layer that directly interacts with the database using JdbcTemplate
@Repository
public class StudentRepository {

    private final JdbcTemplate jdbc;

    public StudentRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    // Maps a ResultSet row to a Student object
    private final RowMapper<Student> studentMapper = new RowMapper<Student>() {
        @Override
        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
            Student student = new Student();
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setEmail(rs.getString("email"));
            student.setCourse(rs.getString("course"));
            return student;
        }
    };

    public void insertStudent(Student student) {
        String query = "INSERT INTO student (name, email, course) VALUES (?, ?, ?)";
        jdbc.update(query, student.getName(), student.getEmail(), student.getCourse());
    }

    public List<Student> getAllStudents() {
        String query = "SELECT * FROM student";
        return jdbc.query(query, studentMapper);
    }

    public Student getStudentById(int id) {
        String query = "SELECT * FROM student WHERE id = ?";
        return jdbc.queryForObject(query, studentMapper, id);
    }

    public void updateStudent(int id, Student student) {
        String query = "UPDATE student SET name = ?, email = ?, course = ? WHERE id = ?";
        jdbc.update(query, student.getName(), student.getEmail(), student.getCourse(), id);
    }

    public void deleteStudent(int id) {
        String query = "DELETE FROM student WHERE id = ?";
        jdbc.update(query, id);
    }
}
