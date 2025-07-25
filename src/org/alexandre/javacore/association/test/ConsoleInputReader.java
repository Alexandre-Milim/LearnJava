package org.alexandre.javacore.association.test;

import java.util.Scanner;

public class ConsoleInputReader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = input.nextLine();

        System.out.println("Enter your age:");
        int age = input.nextInt();
        input.nextLine();

        System.out.println("Enter M (male) or F (female) for your gender:");
        char gender = input.nextLine().charAt(0);

        System.out.println("-----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}
