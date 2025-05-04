package org.alexandre.java.introduction.Exercises;

public class TaxReturn {
    public static void main(String[] args) {
        double salary = 2500;
        double oneTax = 7.5 / 100;
        double secondeTax = 15 / 100;
        double thirdTax = 22.5 / 100;
        double fourthTax = 27.5 / 100;
        double salarioComImposto;
        double imposto;

        if (salary <= 2428.80 ){
            System.out.println("O salário de: "+ salary + " esta livre de imposto!");
        } else if (salary >= 2428.80 && salary <= 2826.65){
            imposto = salary * oneTax;
            salarioComImposto = salary - imposto;
            System.out.println(
                "O valor de "+ "R$ "+imposto+" que corresponde a "+oneTax * 100 + "%" +" foi descontando de seu salário. " +
                "O valor líquido do seu salário é: " + "R$ "+ salarioComImposto
            );


        }else if (salary >= 2826.66 && salary <= 3751.05){
            salary = salary * secondeTax;
            System.out.println("Seu novo salario com os impostos é: "+salary); 
        }else if (salary >= 3751.06 && salary <= 4664.68){
            salary = salary * thirdTax;
            System.out.println("Seu novo sálario com os impostos é: "+salary);
        } else {
            salary = salary * fourthTax;
            System.out.println("Seu novo salario com os impostos é: "+salary);
        }
    }
}