package org.alexandre.javacore.introductionmethods.exercises;

public class Funcionario {
    public String name;
    public int age;

    public void print (){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void salaryFuncionario(double... salary){
        double soma = 0;
        double media = 0;

        for (double num : salary){
            soma += num;
        }
        media = soma / 3;
        System.out.println("A média dos 3 salarios do funcionario é: " + media );
    }



}
