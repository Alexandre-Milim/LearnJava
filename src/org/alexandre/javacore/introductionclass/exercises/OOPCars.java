package org.alexandre.javacore.introductionclass.exercises;

import org.alexandre.javacore.introductionclass.domain.exercises.Cars;

public class OOPCars {
    public static void main(String[] args) {
        Cars car1 = new Cars();
        Cars car2 = new Cars();

        car1.name = "296 GTB";
        car1.model = "Ferrari";
        car1.year = 2022;

        car2.name = "765LT Spider";
        car2.model = "Mclaren";
        car2.year = 2021;

        System.out.println("=== First Car ===");
        System.out.println("Name: " + car1.name);
        System.out.println("Model: " + car1.model);
        System.out.println("Year: " + car1.year);

        System.out.println();

        System.out.println("=== Second Car ===");
        System.out.println("Name: " + car2.name);
        System.out.println("Model: " + car2.model);
        System.out.println("Year: " + car2.year);
    }
}
