package org.alexandre.java.introduction.Exercises;

public class TaxReturn {
    public static void main(String[] args) {
        double salary = 1518.50; 
        
        double tax = 0;
        
        if (salary >= 4664.00) {
            tax = salary * 0.275;
        } else if (salary >= 2259.00) {
            tax = salary * 0.15;
        }
        
        salary -= tax;
        
        System.out.println("Seu salário líquido é: " + salary);
    }
}