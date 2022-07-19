package com.capgemini.university.registration.repositories;

import com.capgemini.university.registration.entities.Specialty;
import com.capgemini.university.registration.factories.SpecialtyFactory;

import java.util.HashSet;
import java.util.Set;

public class SpecialtyRep {

    public static Set<Specialty> economicSpecialty = new HashSet<>();
    public static Set<Specialty> sportSpecialty = new HashSet<>();
    public static Set<Specialty> informaticsSpecialty = new HashSet<>();

    public static void setEconomicSpecialty() {
        for (int i = 0; i < 15 ; i++) {
            SpecialtyRep.economicSpecialty.add(SpecialtyFactory.generateEconomicSpecialty());
        }
    }

    public static void setSportSpecialty() {
        for (int i = 0; i < 15; i++) {
            SpecialtyRep.sportSpecialty.add(SpecialtyFactory.generateSportSpecialty());
        }
    }

    public static void setInformaticsSpecialty() {
        for (int i = 0; i < 15; i++) {
            SpecialtyRep.informaticsSpecialty.add(SpecialtyFactory.generateInformaticSpecialty());
        }
    }

}
