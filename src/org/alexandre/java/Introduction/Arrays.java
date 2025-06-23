package org.alexandre.java.Introduction;


public class Arrays {
	public static void main(String[] args ) {
		String [] nomes = new String[3];
		
		nomes [0] = "Alexandre";
		nomes [1] = "Gabryel";
		nomes [2] = "Milim";
		
		for (int i = 0; i < 3; i++) {
			System.out.println(nomes[i]);
		}
	}
}