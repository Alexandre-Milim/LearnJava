package org.alexandre.javacore.introductionclass.exercises;

import org.alexandre.javacore.introductionclass.domain.exercises.Cars;

public class OOPCars {
    public static void main(String[] args) {
        Cars cars = new Cars();
        Cars cars2 = new Cars();

        cars.name = "296 GTB";
        cars.model = "Ferrari";
        cars.year = 2022;

        cars2.name = "765LT Spider";
        cars2.model = "Mclaren";
        cars2.year = 2021;

        System.out.println("=== First Car ===");
        System.out.println("Name: " + cars.name);
        System.out.println("Model: " + cars.model);
        System.out.println("Year: " + cars.year);

        System.out.println();

        System.out.println("=== Second Car ===");
        System.out.println("Name: " + cars2.name);
        System.out.println("Model: " + cars2.model);
        System.out.println("Year: " + cars2.year);
    }
}
