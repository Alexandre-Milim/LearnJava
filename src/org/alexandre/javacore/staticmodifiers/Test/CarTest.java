package org.alexandre.javacore.staticmodifiers.Test;

import org.alexandre.javacore.staticmodifiers.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("Mustang", 300);

        car.setMaxSpeed(200);
        car.print();
    }
}
