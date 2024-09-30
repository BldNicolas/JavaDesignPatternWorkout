package dp.factory;

import dp.factory.structure.Vehicle;

public class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }
}