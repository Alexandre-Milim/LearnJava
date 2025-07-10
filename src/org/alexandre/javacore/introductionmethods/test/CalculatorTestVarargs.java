package org.alexandre.javacore.introductionmethods.test;

import org.alexandre.javacore.introductionmethods.domain.Calculator;

public class CalculatorTestVarargs {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int[] numeros = {15,21};
        calculator.somaArray(numeros);

        calculator.somaVarArgs(7,7);
    }
}
