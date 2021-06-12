package com.training.test.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.test.project.repository.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
