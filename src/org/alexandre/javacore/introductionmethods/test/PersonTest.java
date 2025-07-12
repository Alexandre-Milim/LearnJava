package org.alexandre.javacore.introductionmethods.test;

import org.alexandre.javacore.introductionmethods.domain.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Alexandre");
        person.setAge(18);
        person.print();
    }
}
