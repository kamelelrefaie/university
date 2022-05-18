package com.example.university.CourseMaterial;

import com.example.university.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseMaterialService {
    private final CourseMaterialRepository courseMaterialRepository;

    @Autowired
    public CourseMaterialService(CourseMaterialRepository courseMaterialRepository) {
        this.courseMaterialRepository = courseMaterialRepository;
    }

    public void addCourseMaterial(String url) {
        Course course = Course.builder().courseTitle("MATH").price(1000).build();
        CourseMaterial courseMaterial = CourseMaterial.builder().url(url).course(course).build();
        courseMaterialRepository.save(courseMaterial);
    }

    public List<CourseMaterial> getCourseMaterials() {
    return courseMaterialRepository.findAll();
    }
}
