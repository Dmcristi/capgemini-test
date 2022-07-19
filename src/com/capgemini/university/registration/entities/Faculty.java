package com.capgemini.university.registration.entities;

import com.capgemini.university.registration.repositories.SpecialtyRep;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Faculty {

    private String facultyName;
    private Set<Specialty> specialtiesNames = new HashSet<>();



    public Faculty(String facultyName) {
        this.facultyName = facultyName;
        if (facultyName.equals("Economics Faculty")){
            this.specialtiesNames = SpecialtyRep.economicSpecialty;
        }
        if (facultyName.equals("Sports Faculty")){
            this.specialtiesNames = SpecialtyRep.sportSpecialty;
        }
        if (facultyName.equals("Informatics Faculty")){
            this.specialtiesNames = SpecialtyRep.informaticsSpecialty;
        }
    }

    public String getFacultyName() {
        return facultyName;
    }

    public Faculty(String facultyName, Set<Specialty> specialtiesNames) {
        this.facultyName = facultyName;
        this.specialtiesNames = specialtiesNames;
    }

    public Set<Specialty> getSpecialtiesNames() {
        return specialtiesNames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return Objects.equals(facultyName, faculty.facultyName) && Objects.equals(specialtiesNames, faculty.specialtiesNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(facultyName, specialtiesNames);
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "facultyName='" + facultyName + '\'' +
                ", specialtiesNames=" + specialtiesNames +
                '}';
    }
}
