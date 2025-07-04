package org.alexandre.javacore.introductionmethods.test;

import org.alexandre.javacore.introductionmethods.domain.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("==== Soma Dois Números: ====");{
            calculator.somaDoisNumeros(20, 2);
        }

        System.out.println("==== Subtrai Dois Números: ====");{
            calculator.subtraiDoisNumeros(20,2);
        }

        System.out.println("==== Multiplica Dois Números: ====");{
            calculator.multiplicaDoisNumeros(20,2);
        }

        System.out.println("==== Divide Dois Números: ====");{
            double result = calculator.divideDoisNumeros(20, 2);
            System.out.println(result);
        }
    }
}
