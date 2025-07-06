package org.alexandre.javacore.introductionmethods.domain;

public class PrintStudent {
    public void print(Student student){
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);
    }
}
