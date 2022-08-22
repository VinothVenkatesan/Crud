package com.crudexample.demo.controller;

import com.crudexample.demo.entity.Product;
import com.crudexample.demo.entity.Student;
import com.crudexample.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/saveStudent")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }


    @PostMapping("/saveStudents")
    public List<Student> saveStudents(@RequestBody List<Student> students){
        return studentService.saveStudents(students);
    }

    @GetMapping("/studentById/{id}")
    public Student getStudentById(@PathVariable int id){
        return studentService.getStudentById(id);
    }

    @GetMapping("/studentByName/{name}")
    public Student getStudentByName(@PathVariable String name){
        return studentService.getStudentByName(name);
    }

    @GetMapping("/getStudentByIdParam")
    public Student getStudentByIdParam(@RequestParam int id){
        return studentService.getStudentById(id);
    }

    @GetMapping("/getStudentByNameParam")
    public Student getStudentByNameParam(@RequestParam String name){
        return studentService.getStudentByName(name);
    }

    @GetMapping("/allStudents")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @DeleteMapping("/deleteStudentById/{id}")
    public String deleteStudentById(@PathVariable int id){
        return studentService.deleteStudentById(id);
    }

    @PutMapping("/updateStudentById")
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudentById(student);
    }
}
