package com.example.university.CourseMaterial;

import com.example.university.course.Course;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseMaterial {
    @Id
    private long courseMaterialId;
    private String url;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(
            referencedColumnName = "courseId",
            name = "course_id"
    )
    private Course course;
}
