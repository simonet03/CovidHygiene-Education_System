package com.CovidHygiene.service.user;

import com.CovidHygiene.entity.Student;
import com.CovidHygiene.service.IService;

import java.util.Set;


public interface StudentService extends IService<Student, String> {

    Set<Student> getAll();

    Set<Student> getStudentsByFirstName(String name);

    Set<Student> getStudentsByLastName(String name);

    Set<Student> getNamesThatStartWith(String a);
}
