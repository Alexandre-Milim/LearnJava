package org.alexandre.javacore.execercise.domain;

public class Seminar {
    private String title;
    private Student student;
    private Local local;

    public Seminar(String title, Student student, Local local) {
        this.title = title;
        this.student = student;
        this.local = local;
    }

    public Seminar(String title, Student student) {
        this.title = title;
        this.student = student;
    }

    public Seminar(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
