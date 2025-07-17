package org.alexandre.javacore.staticmodifiers.Test;

import org.alexandre.javacore.staticmodifiers.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();

        car.setName("Mustang");
        car.setMaxSpeed(451);
        car.setSpeedLimit(249);
        car.print();

    }
}
