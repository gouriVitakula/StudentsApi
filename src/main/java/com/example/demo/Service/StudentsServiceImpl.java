package com.example.demo.Service;

import com.example.demo.Bean.Student;
import com.example.demo.Repo.StudentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class StudentsServiceImpl implements StudentsService{

    @Autowired
    StudentsRepo repo;

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public Student getStudentbyId(int id) {
        Optional<Student> student = repo.findById(id);
        return student.get();
    }

    public void updateStudent(Student student) {
        repo.save(student);
    }

    public void addStudent(Student student) {
        repo.save(student);

    }

    public void deletetStudent(int id) {
        repo.deleteById(id);
    }
}
