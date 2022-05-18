package com.example.university.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void addStudent(String email, String firstName, String lastName, String dob) {

        studentRepository.save(Student.builder().studentEmail(email).firstName(firstName).lastName(lastName).dob(LocalDate.parse(dob)).build());
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
}
