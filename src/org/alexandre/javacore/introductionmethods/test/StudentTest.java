package org.alexandre.javacore.introductionmethods.test;

import org.alexandre.javacore.introductionmethods.domain.PrintStudent;
import org.alexandre.javacore.introductionmethods.domain.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();

        PrintStudent printer = new PrintStudent();

        student01.name = "Alexandre";
        student01.age = 18;
        student01.sex = 'M';

        student02.name = "Gabryel";
        student02.age = 18;
        student02.sex = 'M';

        printer.print(student01);
        System.out.println("-----------");
        printer.print(student02);

    }
}
