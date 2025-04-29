package org.alexandre.java.introduction.Exercises;

public class TaxReturn {
    public static void main(String[] args) {
        double salary = 1518.50; 
        
        double tax15 = salary * 0.15;
        double tax27 = salary * 0.27;
        
        if (salary >= 2.259) {
            salary -= tax15;
        } else if (salary >= 4.664) {
            salary -= tax27;
        }
        
        System.out.println("Seu salário líquido é: " + salary);
    }
}