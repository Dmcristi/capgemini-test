package com.capgemini.university.registration.factories;

import com.capgemini.university.registration.entities.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class StudentFactory {

    static Random generator = new Random();
    //    private String studentName;
    //    private String studentLastName;
    //    private String telephoneNumber;
    //    private Group groupName;

    static List<String> studentNames = new ArrayList<>(Arrays.asList(
                "Dumitrache", "Teodorescu", "Mihalcea", "Dinca", "Preda"
            ));

    static List<String> studentLastNames = new ArrayList<>(Arrays.asList(
            "Alina", "Mihai", "George", "Bogdan", "Mariana", "Bianca"
    ));

    static List<String> telephoneNumbers = new ArrayList<>(Arrays.asList(
            "0745753102", "0745253102", "0745752102", "0745758102", "0745758802", "0745553102",
            "0745753202", "0745743102"
    ));


    public static Student generateStudent(){
        return new Student(studentNames.get(generator.nextInt(studentNames.size())),
                studentLastNames.get(generator.nextInt(studentLastNames.size())),
                telephoneNumbers.get(generator.nextInt(telephoneNumbers.size())));
    }





}
