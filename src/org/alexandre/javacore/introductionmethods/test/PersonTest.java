package org.alexandre.javacore.introductionmethods.test;

import org.alexandre.javacore.introductionmethods.domain.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("admin");
        person.setAge(18);

        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
