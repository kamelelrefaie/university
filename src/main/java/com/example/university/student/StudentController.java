package com.example.university.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public void addStudent(@RequestParam() String email,
                           @RequestParam() String firstName,
                           @RequestParam() String lastName,
                           @RequestParam() String dob
                                       ) {
        studentService.addStudent(email,firstName,lastName,dob);
    }

    @GetMapping
    public List<Student> getStudents(
    ) {
        return  studentService.getStudents();
    }
}
