package com.capgemini.university.registration;

import com.capgemini.university.registration.repositories.FacultyRep;
import com.capgemini.university.registration.repositories.GroupRep;
import com.capgemini.university.registration.repositories.SpecialtyRep;
import com.capgemini.university.registration.repositories.StudentRep;

public class Initializer {
    static void initialize() {
        SpecialtyRep.setEconomicSpecialty();
        SpecialtyRep.setSportSpecialty();
        SpecialtyRep.setInformaticsSpecialty();
        FacultyRep.setFaculties();
        GroupRep.setGroups();
        StudentRep.setStudents();
    }
}
