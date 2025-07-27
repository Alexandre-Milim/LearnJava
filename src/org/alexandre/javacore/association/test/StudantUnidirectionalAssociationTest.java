package org.alexandre.javacore.association.test;

import org.alexandre.javacore.association.domain.School;
import org.alexandre.javacore.association.domain.Student;

public class StudantUnidirectionalAssociationTest {
    public static void main(String[] args) {
        Student studant = new Student("Alexandre");

        School school = new School("FATEB");

        studant.setSchool(school);
        studant.print();
    }
}
