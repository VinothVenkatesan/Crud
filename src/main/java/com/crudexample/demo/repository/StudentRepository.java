package com.crudexample.demo.repository;

import com.crudexample.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    Student findStudentByName(String name);
}
