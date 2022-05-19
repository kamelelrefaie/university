package com.example.university.course;

import com.example.university.CourseMaterial.CourseMaterial;
import com.example.university.student.Student;
import com.example.university.teacher.Teacher;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.mapping.Join;

import javax.persistence.*;
import java.util.List;
import java.util.Locale;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {
    @Id
    @SequenceGenerator(
            name = "course_sequence",
            sequenceName = "course_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "course_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private long courseId;
    private String courseTitle;
    private int price;

    @OneToOne(
            mappedBy = "course"
    )
    private CourseMaterial courseMaterial;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teacher_id", referencedColumnName = "teacherId")
    private Teacher teacher;

    @ManyToMany
    @JoinTable(name = "student_course_tbl",
            joinColumns = @JoinColumn(name = "course_id", referencedColumnName = "courseId"),inverseJoinColumns = @JoinColumn(name = "student_id",referencedColumnName = "studentId"))
    private List<Student> students;

}
