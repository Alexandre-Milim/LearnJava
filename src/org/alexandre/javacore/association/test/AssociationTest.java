package org.alexandre.javacore.association.test;

import org.alexandre.javacore.association.execercise.domain.Local;
import org.alexandre.javacore.association.execercise.domain.Seminar;
import org.alexandre.javacore.association.execercise.domain.Student;
import org.alexandre.javacore.association.execercise.domain.Teacher;

public class AssociationTest {
    public static void main(String[] args) {
        Local local = new Local("Street of the English");
        Student student = new Student("Alexandre", 18);
        Teacher teacher = new Teacher("Igor", "Front-End");
        Student[] studentsForSeminar = {student};
        Seminar seminar = new Seminar("Learn Java", studentsForSeminar, local);

        Seminar[] availableSeminars = {seminar};

        teacher.setSeminars(availableSeminars);

        teacher.print();
    }
}
