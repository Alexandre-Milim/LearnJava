package org.alexandre.java.Introduction;

public class ArraysMultidimensional {
    public static void main(String[] args) {
        int [][] dias = new int [3] [3];

        dias [0] [0] = 1;
        dias [0] [1] = 2;
        dias [0] [2] = 3;

        dias [1] [0] = 4;
        dias [1] [1] = 5;
        dias [1] [2] = 6;

        dias [2] [0] = 7;
        dias [2] [1] = 8;
        dias [2] [2] = 9;

        for (int i = 0; i < dias.length ; i++) {
            for (int j = 0; j <dias[i].length ; j++) {
                System.out.println(dias[i][j]);
            }
        }

        for (int[] BaseArrays : dias ){
            for (int num: BaseArrays ){
                System.out.println(num);
            }
        }
    }
}
