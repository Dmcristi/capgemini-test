package com.capgemini.university.registration;


import com.capgemini.university.registration.entities.Faculty;
import com.capgemini.university.registration.entities.University;
import com.capgemini.university.registration.reports.Report;
import com.capgemini.university.registration.repositories.FacultyRep;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Initializer.initialize();
        University university = CreateUniversity.create();

        Report.displayBriefInfo(university);
        Report.displayAllInfo(university);











    }
}
