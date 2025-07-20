package org.alexandre.javacore.association.domain;

public class Studant {
    private String name;
    private School school;

    public void print(){
        System.out.println(this.name);
        if (school != null){
            System.out.println(school.getName());
        }
    }

    public Studant(String name){
           this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSchool(School school) {

        this.school = school;
    }

    public School getSchool() {
        return school;
    }
}
