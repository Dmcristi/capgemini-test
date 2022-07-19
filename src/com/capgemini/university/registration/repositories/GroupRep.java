package com.capgemini.university.registration.repositories;

import com.capgemini.university.registration.entities.Group;
import com.capgemini.university.registration.factories.GroupFactory;

import java.util.HashSet;
import java.util.Set;

public class GroupRep {

    public static Set<Group> groups = new HashSet<>();

    public static void setGroups() {
        for (int i = 0; i < 15; i++) {
            GroupRep.groups.add(GroupFactory.generateGroup());

        }
    }
}
