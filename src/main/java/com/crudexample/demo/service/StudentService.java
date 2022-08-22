package com.crudexample.demo.service;

import com.crudexample.demo.entity.Product;
import com.crudexample.demo.entity.Student;
import com.crudexample.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    public List<Student> saveStudents(List<Student> students){
        return studentRepository.saveAll(students);
    }

    public Student getStudentById(int id){
        return studentRepository.findById(id).orElse(null);
    }

    public Student getStudentByName(String name){
        return studentRepository.findStudentByName(name);
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public String deleteStudentById(int id){
        studentRepository.deleteById(id);
        return "Student " +" "+ id +" "+ "deleted Successfully";
    }
    
    public Student updateStudentById(Student student){
        Student exsistingStudent = studentRepository.findById(student.getId()).orElse(null);
        exsistingStudent.setName(student.getName());
        exsistingStudent.setRollNo(student.getRollNo());
        return studentRepository.save(exsistingStudent);
    }
}
