package org.alexandre.javacore.staticmodifiers.domain;

public class Serie {
    private String name;
    private static int[] episodes;

    {
        episodes = new int[34];
        for (int i = 0; i < episodes.length ; i++) {
            episodes[i] = i+1;
        }
    }

    public Serie(){
        for (int episodes : Serie.episodes){
            System.out.print(episodes + " ");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int[] episodes) {
        Serie.episodes = episodes;
    }
}
