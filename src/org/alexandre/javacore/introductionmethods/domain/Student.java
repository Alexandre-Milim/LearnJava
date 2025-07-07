package org.alexandre.javacore.introductionmethods.domain;

public class Student {
    public String name;
    public int age;
    public char sex;

    public void print (){
        System.out.println("======");
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.sex);
    }
}