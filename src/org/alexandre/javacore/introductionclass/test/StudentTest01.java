package org.alexandre.javacore.introductionclass.test;

import org.alexandre.javacore.introductionclass.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "Alexandre";
        student.age = 18;
        student.sex = 'M';

        System.out.println(student.name);
    }
}
