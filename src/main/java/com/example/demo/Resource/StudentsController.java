package com.example.demo.Resource;

import com.example.demo.Bean.Student;
import com.example.demo.Service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentsController {
    @Autowired
    StudentsService studentsService;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        List<Student> studentsList = studentsService.getAllStudents();
        return studentsList;
    }

    @GetMapping("/students/{id}")
    public Student getStudentbyId(@PathVariable int id){
        return  studentsService.getStudentbyId(id);
    }

    @PostMapping("/students")
    public void addStudent(@RequestBody Student student){
        studentsService.addStudent(student);
    }

    @PutMapping("/students")
    public void updateStudent(@RequestBody Student student){
       Student stdObj = studentsService.getStudentbyId(student.getId());
       stdObj.setName(student.getName());
       stdObj.setGrade(student.getGrade());
       stdObj.setDob(student.getDob());
       studentsService.updateStudent(stdObj);
    }

    @DeleteMapping("/students/{id}")
    public void deletetStudent(@PathVariable int id){
        studentsService.deletetStudent(id);
    }

}
