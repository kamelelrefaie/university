package com.example.university.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentParent {
    private String parentName;
    private String parentEmail;
    private String parentPhone;
}
