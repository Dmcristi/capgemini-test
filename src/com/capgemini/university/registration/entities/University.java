package com.capgemini.university.registration.entities;

import com.capgemini.university.registration.repositories.FacultyRep;
import com.capgemini.university.registration.repositories.GroupRep;
import com.capgemini.university.registration.repositories.StudentRep;

import java.util.HashSet;
import java.util.Set;

public class University {

    private String universityName;
    private String universityAddress;
    private Set<Faculty> facultyNames = new HashSet<>();

    public University(String universityName, String universityAddress) {
        this.universityName = universityName;
        this.universityAddress = universityAddress;
        this.facultyNames = FacultyRep.faculties;
    }


    public void addFaculty(Faculty f){
        facultyNames.add(f);
    }

    public void removeFaculty(Faculty f){
        facultyNames.remove(f);
    }

    public void addGroups(Group g){
        GroupRep.groups.add(g);
    }

    public void removeGroups(Group g){
        GroupRep.groups.remove(g);
    }

    public void addStudent(Student s){
        StudentRep.students.add(s);
    }

    public void removeStudent(Student s){
        StudentRep.students.remove(s);
    }

    public Set<Faculty> getFacultyNames() {
        return facultyNames;
    }

    @Override
    public String toString() {
        return "University{" +
                "universityName='" + universityName + '\'' +
                ", universityAddress='" + universityAddress + '\'' +
                ", facultyNames=" + facultyNames +
                '}';
    }
}
