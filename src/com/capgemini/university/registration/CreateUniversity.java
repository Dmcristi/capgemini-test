package com.capgemini.university.registration;

import com.capgemini.university.registration.entities.University;

public class CreateUniversity {
    public static University create(){
        return new University("Dunarea de jos", "Galati");
    }
}
