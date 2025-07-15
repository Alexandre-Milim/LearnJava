package org.alexandre.javacore.Initializationblocks.test;

import org.alexandre.javacore.Initializationblocks.domain.Serie;

public class SerieTest {
    public static void main(String[] args) {
        Serie serie = new Serie("Stranger Things");

        for (int episode : serie.getEpisodes()) {
            System.out.print(episode + " ");
        }


    }
}
