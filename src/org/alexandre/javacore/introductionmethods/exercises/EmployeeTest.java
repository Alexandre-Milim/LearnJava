package org.alexandre.javacore.introductionmethods.exercises;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.name = "Alexandre";
        employee.age = 18;

        employee.print();
        employee.printAverageSalary(4600, 6400, 7000);
    }
}
