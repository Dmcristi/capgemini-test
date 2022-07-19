package com.capgemini.university.registration.repositories;

import com.capgemini.university.registration.entities.Faculty;
import com.capgemini.university.registration.factories.FacultyFactory;

import java.util.HashSet;
import java.util.Set;

public class FacultyRep {

    public static Set<Faculty> faculties = new HashSet<>();

    public static void setFaculties() {
        for (int i = 0; i < 15; i++) {
            FacultyRep.faculties.add(FacultyFactory.generateFaculty());
        }
    }
}
