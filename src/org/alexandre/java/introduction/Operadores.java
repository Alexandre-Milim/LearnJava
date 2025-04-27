package org.alexandre.java.introduction;

/**
 * Verifica condições para votação no Brasil baseado em idade e título de eleitor.
 */
public class Operadores {
    public static void main(String[] args) {
        int age = 16;
        boolean hasVoterID = true;

        boolean canVoteFacultative = (age >= 16 && age <= 17 || age >= 70) && hasVoterID;
        
        boolean isMandatory = (age >= 18 && age <= 70) && hasVoterID;

        System.out.println("Pode votar (facultativo)? " + canVoteFacultative);
        System.out.println("Voto obrigatório? " + isMandatory);
    }
}