package org.alexandre.java.Introduction;

public class LoopingStructure {
    public static void main(String[] args) {
        int count = 0;
        while (count < 5) {
            System.out.println("Exibindo while: "+count);
            count ++;
        }

        for(int i = 0;i < 5; i++){
            System.out.println("Exibindo for: "+i);
        }
    }
}
