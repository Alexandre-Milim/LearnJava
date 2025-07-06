package org.alexandre.javacore.introductionmethods.test;

import org.alexandre.javacore.introductionmethods.domain.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("==== Add Two Numbers: ====");{
            calculator.sumTwoNumbers(20, 2);
        }

        System.out.println("==== Subtract Two Numbers: ====");{
            calculator.subtractTwoNumbers(20,2);
        }

        System.out.println("==== Multiply Two Numbers: ====");{
            calculator.multiplyTwoNumbers(20,2);
        }

        System.out.println("==== Divide Two Numbers: ====");{
            double result = calculator.divideTwoNumbers(20, 2);
            System.out.println(result);
        }
    }
}
