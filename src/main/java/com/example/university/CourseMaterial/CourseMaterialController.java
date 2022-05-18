package com.example.university.CourseMaterial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("course/material")
public class CourseMaterialController {

    private final CourseMaterialService courseMaterialService;

    @Autowired
    public CourseMaterialController(CourseMaterialService courseMaterialService) {
        this.courseMaterialService = courseMaterialService;
    }

    @GetMapping
public List<CourseMaterial> getCourseMaterials(){
        return courseMaterialService.getCourseMaterials();
}
    @PostMapping(path = "/add")
    public void addCourseMaterial(@RequestParam() String url){
        courseMaterialService.addCourseMaterial(url);

    }

}
