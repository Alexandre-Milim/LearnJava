package org.alexandre.javacore.association.execercise.domain;

public class Teacher {
    private String name;
    private String specialty;
    private Seminar[] seminars;

    public Teacher(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public Teacher(String name, String specialty, Seminar[] seminars) {
        this.name = name;
        this.specialty = specialty;
        this.seminars = seminars;
    }

    public void print(){
        System.out.println("-----");
        System.out.println("Professor: " + this.name);
        if (this.seminars == null) return;
        System.out.println("## Seminarios Cadastrados ##");
        for (Seminar seminar : this.seminars){
            System.out.println(seminar.getTitle());
            System.out.println(seminar.getLocal().getAddress());
            if (seminar.getStudent() == null || seminar.getStudent().length == 0) continue;
            System.out.println("** Aluno **");
            for (Student student : seminar.getStudent()){
                System.out.println("Aluno: " + student.getName() + "Idade: " + student.getAge());
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }
}
