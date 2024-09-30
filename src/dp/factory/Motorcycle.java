package dp.factory;

import dp.factory.structure.Vehicle;

public class Motorcycle implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started.");
    }
}