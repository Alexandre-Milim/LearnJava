package org.alexandre.javacore.introductionmethods.test;

import org.alexandre.javacore.introductionmethods.domain.Student;

public class StudentTestUsingThis {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();

        student01.name = "Alexandre Gabryel";
        student01.age = 18;
        student01.sex = 'M';

        student02.name = "Milim";
        student02.age = 18;
        student02.sex = 'M';

        student01.print();
        student02.print();
    }
}
