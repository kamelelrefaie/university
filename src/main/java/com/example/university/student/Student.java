package com.example.university.student;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Builder
@Table(uniqueConstraints = @UniqueConstraint(name = "email_unique_constraint", columnNames = "studentEmail"))
public class Student {
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @Id
    @GeneratedValue(
            generator = "student_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private long studentId;
    private String firstName;
    private String lastName;
    @Column(nullable = false)
    private String studentEmail;
    private LocalDate dob;
    @Transient
    private int age;
    @Embedded
    private StudentParent studentParent;

    public int getAge() {
        return Period.between(dob, LocalDate.now()).getYears();
    }

}
