package org.alexandre.javacore.staticmodifiers.domain;

public class Car {
    private String name;
    private double maxSpeed;
    private double speedLimit = 250;

    public void print() {
        System.out.println("--------");
        System.out.println("Name: " + this.name);
        System.out.println("Max Speed: " + this.maxSpeed);
        System.out.println("Speed Limit: " + this.speedLimit);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setSpeedLimit(double speedLimit) {
        this.speedLimit = speedLimit;
        if (speedLimit > 249) {
            System.out.println("You are at the limit");
        } else {
            System.out.println("You are below the limit");
        }
    }

    public double getSpeedLimit() {
        return speedLimit;
    }
}
