package org.alexandre.javacore.staticmodifiers.Test;

import org.alexandre.javacore.staticmodifiers.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("Mustang", 300, 249);

        car.setMaxSpeed(200);
        car.setSpeedLimit(251);
        car.print();
    }
}
