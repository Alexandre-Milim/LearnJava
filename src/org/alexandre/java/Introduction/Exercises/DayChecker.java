package org.alexandre.java.Introduction.Exercises;

public class DayChecker {
    public static void main(String[] args) {
        byte day = 1;

        switch (day) {
            case 1, 7:
                System.out.println("Final de Semana");
                break;
            case 2, 3, 4, 5, 6:
                System.out.println("Dia Letivo");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}