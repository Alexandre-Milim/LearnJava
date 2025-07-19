package org.alexandre.javacore.association.domain;

public class Studant {
    private String name;

    public void print(){
        System.out.println(this.name);
    }

    public Studant(String name){
           this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
