package com.ssau.study.repository;

import com.ssau.study.entity.Student;

import java.util.List;

public interface StudentRepository {
    int count();

    List<Student> findAll();

    List<Student> findAllByName(String name);

    Student findById(long id);

    long addStudent(Student std);

    long deleteStudent(long id);

    Student updateStudent(Student std);
}
