package org.alexandre.java.Introduction;

public class PrimitiveTypes {
    
    public static void main(String[] args) {
        String name = "Alexandre";
        String adress = "Brazil, São Paulo";
        double salary = 1518.50;
        String salaryPaymentDate = "xx/xx/xx";
        
        String relatório = "Declaro para os devidos fins que eu, " + name + ", residente em " + adress + 
        ", recebi o valor de R$" + salary + " referente a remuneração, em " + salaryPaymentDate + ".";
        System.out.println(relatório);
    } 
}