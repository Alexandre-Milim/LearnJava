package org.alexandre.javacore.association.test;

import org.alexandre.javacore.association.domain.Studant;

public class StudantTest {
    public static void main(String[] args) {
        Studant studant0 = new Studant("Alexandre");
        Studant studant1 = new Studant("Gabryel");
        Studant studant2 = new Studant("Milim");

        Studant[] students = {studant0,studant1,studant2};

        for (Studant studant : students ){
            studant.print();
        }
    }
}
