package org.alexandre.javacore.staticmodifiers.domain;

public class Car {
    private String name;
    private double maximumSpeed;
    private double limitedSpeed = 250;

    public void print(){
        System.out.println("--------");
        System.out.println("Name: " + this.name);
        System.out.println("Maximum Speed: " + this.maximumSpeed);
        System.out.println("Limited Speed: " + this.limitedSpeed);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMaximumSpeed (double maximumSpeed){
        this.maximumSpeed = maximumSpeed;
    }

    public double getMaximumSpeed(){
        return this.maximumSpeed;
    }

    public void setLimitedSpeed (double limitedSpeed){
        this.limitedSpeed = limitedSpeed;
    }

    public double getLimitedSpeed(){
        return limitedSpeed;
    }
}
