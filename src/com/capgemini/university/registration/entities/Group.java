package com.capgemini.university.registration.entities;

import com.capgemini.university.registration.repositories.FacultyRep;
import com.capgemini.university.registration.repositories.SpecialtyRep;
import com.capgemini.university.registration.repositories.StudentRep;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Group {
    private String groupName;
    private Specialty specialty;
    private String facultyName;
    private List<Student> students = new ArrayList<>(StudentRep.students);


    static Random generator = new Random();

    public Group(String groupName) {
        this.groupName = groupName;
        if (groupName.equals("A")){
            List<Specialty> specialtyList = new ArrayList<>(SpecialtyRep.economicSpecialty);
            this.specialty = specialtyList.get(generator.nextInt(specialtyList.size()));

            List<Faculty> facultyList = new ArrayList<>(FacultyRep.faculties);
            this.facultyName = facultyList.get(0).getFacultyName();
        }
        if (groupName.equals("B")){
            List<Specialty> specialtyList = new ArrayList<>(SpecialtyRep.sportSpecialty);
            this.specialty = specialtyList.get(generator.nextInt(specialtyList.size()));

            List<Faculty> facultyList = new ArrayList<>(FacultyRep.faculties);
            this.facultyName = facultyList.get(1).getFacultyName();
        }
        if (groupName.equals("C")){
            List<Specialty> specialtyList = new ArrayList<>(SpecialtyRep.informaticsSpecialty);
            this.specialty = specialtyList.get(generator.nextInt(specialtyList.size()));

            List<Faculty> facultyList = new ArrayList<>(FacultyRep.faculties);
            this.facultyName = facultyList.get(2).getFacultyName();
        }
//        this.students = (ArrayList<Student>) StudentRep.students;
    }

    public Group(String groupName, Specialty specialty, String facultyName) {
        this.groupName = groupName;
        this.specialty = specialty;
        this.facultyName = facultyName;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", specialty=" + specialty +
                ", facultyName='" + facultyName + '\'' +
                '}';
    }
}
