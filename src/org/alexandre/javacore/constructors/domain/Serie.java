package org.alexandre.javacore.constructors.domain;

import java.util.Locale;

public class Serie {
    private String name;
    private String type;
    private int episode;
    private String genre;
    private String studio;

    public Serie(String name, String type, int episode, String genre){
        this.name = name;
        this.type = type;
        this.episode = episode;
        this.genre = genre;
    }

    public Serie(String name, String type, int episode, String genre, String studio){
        this(name, type, episode, genre);
        this.studio = studio;
    }

    public void print(){
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episode);
        System.out.println(this.genre);
        System.out.println(this.studio);
    }

    public void setName (String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }


    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    public void setEpisode(int episode){
        this.episode = episode;
    }

    public int getEpisode(){
        return this.episode;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public String getGenre (){
        return this.genre;
    }
}
