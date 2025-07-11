package org.alexandre.javacore.introductionmethods.exercises;

public class Employee {
    public String name;
    public int age;

    public void print() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void printAverageSalary(double... salaries) {
        double sum = 0;
        double average = 0;

        for (double salary : salaries) {
            sum += salary;
        }

        average = sum / 3;
        System.out.println("The average of the employee's 3 salaries is: " + average);
    }
}
