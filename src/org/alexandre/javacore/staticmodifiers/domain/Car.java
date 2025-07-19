package org.alexandre.javacore.staticmodifiers.domain;

public class Car {
    private String name;
    private double maxSpeed;
    private final double speedLimit = 250;

    public Car(String name, double maxSpeed){
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public void print() {
        System.out.println("--------");
        System.out.println("Name: " + this.name);
        System.out.println("Max Speed: " + this.maxSpeed);
        System.out.println("Speed Limit: " + this.speedLimit);

        if (this.speedLimit == 250) {
            System.out.println("Speed limit is fixed at 250 and cannot be changed.");
        }
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
        if (maxSpeed > 400) {
            System.out.println("This car is extremely fast!");
        } else if (maxSpeed >= 350) {
            System.out.println("Close to the speed limit, be careful!");
        }
    }

    public double getMaxSpeed() {
        return this.maxSpeed;
    }
}
