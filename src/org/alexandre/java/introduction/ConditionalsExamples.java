package org.alexandre.java.introduction;

public class ConditionalsExamples {
    public static void main(String[] args) {
        /** Conditional using Ternary Operator */
        int age = 18;
        
        String authorization = age >= 18 ? "Compra de álcool permitida" : "Compra de álcool proibida";
        System.out.println("Ternary result: " + authorization);


        /** Conditional using if, else if and else */
        double purchaseAmount = 50.0;
        String discountTier;
        
        if (purchaseAmount > 300.00) {
            discountTier = "20% de desconto aplicado";
        } 
        else if (purchaseAmount > 150.00) {
            discountTier = "10% de desconto aplicado";
        } 
        else {
            discountTier = "Nenhum desconto disponível";
        }
        
        System.out.println(discountTier);
    }
}