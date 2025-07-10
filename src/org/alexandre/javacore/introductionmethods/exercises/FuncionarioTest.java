package org.alexandre.javacore.introductionmethods.exercises;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.name = "Alexandre";
        funcionario.age = 18;

        funcionario.print();
        funcionario.salaryFuncionario(4600,6400,7000);
    }


}
