package org.alexandre.java.Introduction;

public class ArraysMultidimensionalPt2 {
    public static void main(String[] args) {
        int [] [] ArraysInt = new int [3] [];

        ArraysInt[0] = new int[2];
        ArraysInt[1] = new int[4];
        ArraysInt[2] = new int[6];

        int [] [] ArraysInt2 = {{1,2},{1,2,3,4},{1,2,3,4,5,6}};

        for (int [] base : ArraysInt){
            System.out.println("\n");
            for (int num : base ){
                System.out.print(num + "");
            }
        }


        for(int[] baseArray2 : ArraysInt2){
            System.out.println("\n");
            for (int num2 : baseArray2 ){
                System.out.print(num2);
            }
        }
    }
}
