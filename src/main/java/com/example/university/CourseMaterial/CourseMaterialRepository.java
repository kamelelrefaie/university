package com.example.university.CourseMaterial;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface CourseMaterialRepository extends JpaRepository<CourseMaterial,Long> {
}
