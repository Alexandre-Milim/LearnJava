package org.alexandre.javacore.staticmodifiers.domain;

public class Car {
    private String name;
    private double maxSpeed;
    private double speedLimit;

    public Car(String name, double maxSpeed, double speedLimit){
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.speedLimit = speedLimit;
    }

    public void print() {
        System.out.println("--------");
        System.out.println("Name: " + this.name);
        System.out.println("Max Speed: " + this.maxSpeed);
        System.out.println("Speed Limit: " + this.speedLimit);
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
        if (maxSpeed > 400) {
            System.out.println("This car is extremely fast!");
        } else if (maxSpeed >= 350) {
            System.out.println("Close to the speed limit, be careful!");
        }
        // Se for menor que 350, nenhuma mensagem será exibida
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
