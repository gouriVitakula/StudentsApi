package com.example.demo.Service;

import com.example.demo.Bean.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface StudentsService {

    public List<Student> getAllStudents();

    public Student getStudentbyId( int id);

    public void updateStudent(Student student);

    public void addStudent(Student student);

    public void deletetStudent(int id);
}
