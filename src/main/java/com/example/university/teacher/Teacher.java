package com.example.university.teacher;


import com.example.university.course.Course;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table
@Entity
public class Teacher {
    @SequenceGenerator(name = "teacher_sequence", sequenceName = "teacher_sequence", allocationSize = 1)
    @Id
    @GeneratedValue(generator = "teacher_sequence", strategy = GenerationType.SEQUENCE)
    private long teacherId;
    private String firstName;
    private String lastName;


}
