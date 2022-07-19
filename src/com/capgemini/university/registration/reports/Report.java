package com.capgemini.university.registration.reports;

import com.capgemini.university.registration.entities.Faculty;
import com.capgemini.university.registration.entities.Specialty;
import com.capgemini.university.registration.entities.University;
import com.capgemini.university.registration.repositories.FacultyRep;
import com.capgemini.university.registration.repositories.SpecialtyRep;

public class Report {

    public  static void displayBriefInfo(University u){
        System.out.println(u);
    }

    public  static void displayAllInfo(University u){
        System.out.println(u.toString() + " " + u.getFacultyNames());
    }

    //To do implement the rest of methods




}
