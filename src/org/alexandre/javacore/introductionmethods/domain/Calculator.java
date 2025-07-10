package org.alexandre.javacore.introductionmethods.domain;

public class Calculator {
    public void sumTwoNumbers(int num1 , int num2) {
        System.out.println(num1 + num2 );
    }

    public void subtractTwoNumbers(int num1, int num2){
        System.out.println(num1 - num2);
    }

    public void multiplyTwoNumbers(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double divideTwoNumbers(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return num1 / num2;
    }

    public void somaArray (int[] numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
