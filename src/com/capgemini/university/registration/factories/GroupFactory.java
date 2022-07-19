package com.capgemini.university.registration.factories;

import com.capgemini.university.registration.entities.Group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GroupFactory {


    static Random generator = new Random();

    static List<String> groupNames = new ArrayList<>(Arrays.asList(
            "A", "B", "C", "D"
    ));

    public static Group generateGroup(){
        return new Group(groupNames.get(generator.nextInt(groupNames.size())));
    }
}
