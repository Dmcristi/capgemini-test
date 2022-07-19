package com.capgemini.university.registration.factories;

import com.capgemini.university.registration.entities.Specialty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SpecialtyFactory {

    static Random generator = new Random();

    static List<String> economicSpecialtyNames = new ArrayList<>(Arrays.asList(
            "Economics", "Business Administration", "Marketing",
            "Accounting"
    ));

    static List<String> sportSpecialtyNames = new ArrayList<>(Arrays.asList(
            "Athletics", "Muscular Growth", "Swimming", "Body Building"
    ));

    static List<String> informaticsSpecialtyNames = new ArrayList<>(Arrays.asList(
            "Informatics", "Programming", "Security", "Databases"
    ));




    public static Specialty generateEconomicSpecialty(){
        return new Specialty(economicSpecialtyNames.get(generator.nextInt(economicSpecialtyNames.size())));
    }

    public static Specialty generateSportSpecialty(){
        return new Specialty(sportSpecialtyNames.get(generator.nextInt(sportSpecialtyNames.size())));
    }

    public static Specialty generateInformaticSpecialty(){
        return new Specialty(informaticsSpecialtyNames.get(generator.nextInt(informaticsSpecialtyNames.size())));
    }
}
