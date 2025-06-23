package org.alexandre.java.Introduction.Exercises;

public class TaxReturn {
    public static void main(String[] args) {
        double salary = 3000;
        double firstTaxRate = 7.5 / 100;
        double secondTaxRate = 15.0 / 100;
        double thirdTaxRate = 22.5 / 100;
        double fourthTaxRate = 27.5 / 100;
        double netSalary;
        double taxAmount;

        if (salary <= 2428.80) {
            System.out.println("O salário de: "+ salary + " esta livre de imposto!");

        } else if (salary >= 2428.81 && salary <= 2826.65) {
            taxAmount = salary * firstTaxRate;
            netSalary = salary - taxAmount;
            System.out.println(
                "O valor de "+ "R$ "+taxAmount+" que corresponde a "+firstTaxRate * 100 + "%" +" foi descontando de seu salário. " +
                "O valor líquido do seu salário é: " + "R$ "+ netSalary );

        } else if (salary >= 2826.66 && salary <= 3751.05) {
            taxAmount = salary * secondTaxRate;
            netSalary = salary - taxAmount;
            System.out.println(
                "O valor de "+ "R$ "+taxAmount+" que corresponde a "+secondTaxRate * 100 + "%" +" foi descontando de seu salário. " +
                "O valor líquido do seu salário é: " + "R$ "+ netSalary );

        } else if (salary >= 3751.06 && salary <= 4664.68) {
            taxAmount = salary * thirdTaxRate;
            netSalary = salary - taxAmount;
            System.out.println(
                "O valor de "+ "R$ "+taxAmount+" que corresponde a "+thirdTaxRate * 100 + "%" +" foi descontando de seu salário. " +
                "O valor líquido do seu salário é: " + "R$ "+ netSalary );

        } else {
            taxAmount = salary * fourthTaxRate;
            netSalary = salary - taxAmount;
            System.out.println(
                "O valor de "+ "R$ "+taxAmount+" que corresponde a "+ fourthTaxRate * 100 + "%" +" foi descontando de seu salário. " +
                "O valor líquido do seu salário é: " + "R$ "+ netSalary );
        }
    }
}