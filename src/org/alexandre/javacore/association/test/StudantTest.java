package org.alexandre.javacore.association.test;

import org.alexandre.javacore.association.domain.Student;

public class StudantTest {
    public static void main(String[] args) {
        Student studant0 = new Student("Alexandre");
        Student studant1 = new Student("Gabryel");
        Student studant2 = new Student("Milim");

        Student[] students = {studant0,studant1,studant2};

        for (Student studant : students ){
            studant.print();
        }
    }
}
