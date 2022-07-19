package com.capgemini.university.registration.factories;

import com.capgemini.university.registration.entities.Faculty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FacultyFactory {

    static Random generator = new Random();

    static List<String> facultyNames = new ArrayList<>(Arrays.asList(
            "Economics Faculty", "Sports Faculty", "Informatics Faculty"
    ));


    public static Faculty generateFaculty(){
        return new Faculty(facultyNames.get(generator.nextInt(facultyNames.size())));
    }
}
