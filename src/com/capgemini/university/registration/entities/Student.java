package com.capgemini.university.registration.entities;

import com.capgemini.university.registration.repositories.GroupRep;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Student {
    private String studentName;
    private String studentLastName;
    private String telephoneNumber;
    private String groupName;

    static Random generator = new Random();



    public Student(String studentName, String studentLastName, String telephoneNumber) {
        this.studentName = studentName;
        this.studentLastName = studentLastName;
        this.telephoneNumber = telephoneNumber;
        List<Group> groupList = new ArrayList<>(GroupRep.groups);
        this.groupName = groupList.get(generator.nextInt(groupList.size())).getGroupName();
    }

    public Student(String studentName, String studentLastName, String telephoneNumber, String groupName) {
        this.studentName = studentName;
        this.studentLastName = studentLastName;
        this.telephoneNumber = telephoneNumber;
        this.groupName = groupName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentName, student.studentName) && Objects.equals(studentLastName, student.studentLastName) && Objects.equals(telephoneNumber, student.telephoneNumber) && Objects.equals(groupName, student.groupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentName, studentLastName, telephoneNumber, groupName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentLastName='" + studentLastName + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", groupName=" + groupName +
                '}';
    }
}
