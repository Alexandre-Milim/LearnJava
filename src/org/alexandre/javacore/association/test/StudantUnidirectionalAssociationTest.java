package org.alexandre.javacore.association.test;

import org.alexandre.javacore.association.domain.School;
import org.alexandre.javacore.association.domain.Studant;

public class StudantUnidirectionalAssociationTest {
    public static void main(String[] args) {
        Studant studant = new Studant("Alexandre");

        School school = new School("FATEB");

        studant.setSchool(school);
        studant.print();
    }
}
