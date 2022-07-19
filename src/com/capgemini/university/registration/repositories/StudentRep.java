package com.capgemini.university.registration.repositories;

import com.capgemini.university.registration.entities.Student;
import com.capgemini.university.registration.factories.StudentFactory;

import java.util.HashSet;
import java.util.Set;

public class StudentRep {

    public static Set<Student> students = new HashSet<>();

    public static void setStudents() {
        for (int i = 0; i < 100; i++) {
            StudentRep.students.add(StudentFactory.generateStudent());
        }
    }
}
