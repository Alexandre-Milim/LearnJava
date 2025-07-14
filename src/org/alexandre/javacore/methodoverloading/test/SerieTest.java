package org.alexandre.javacore.methodoverloading.test;

import org.alexandre.javacore.methodoverloading.domain.Serie;

public class SerieTest {
    public static void main(String[] args) {
        Serie serie = new Serie();
        serie.init("Stranger Things" , "Web Series", 34, "Science fiction");
        serie.print();
    }
}
