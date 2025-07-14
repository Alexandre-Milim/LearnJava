package org.alexandre.javacore.constructors.test;

import org.alexandre.javacore.constructors.domain.Serie;

public class SerieTest {
    public static void main(String[] args) {
        Serie serie = new Serie("Stranger Things" , "Web Series", 34, "Science fiction");
        serie.print();
    }
}
