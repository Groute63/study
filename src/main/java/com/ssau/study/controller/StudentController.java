package com.ssau.study.controller;

import com.ssau.study.entity.Student;
import com.ssau.study.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/count")
    public int count() {
        return studentRepository.count();
    }

    @GetMapping
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @GetMapping("/findAllByName/{name}")
    public List<Student> findAllByName(@PathVariable String name) {
        return studentRepository.findAllByName(name);
    }

    @GetMapping("/{id}")
    public Student findById(@PathVariable int id) {return studentRepository.findById(id);}

    @PostMapping
    public long addStudent(@RequestBody Student std) {return studentRepository.addStudent(std);}

    @DeleteMapping("/{id}")
    public long deleteStudent(@PathVariable int id) {return studentRepository.deleteStudent(id);}

    @PutMapping
    public Student updateStudent(@RequestBody Student std) {return studentRepository.updateStudent(std);}
}
