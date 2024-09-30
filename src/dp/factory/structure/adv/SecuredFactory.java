package dp.factory.structure.adv;

import dp.factory.structure.Vehicle;

class Car implements Vehicle {
    Car() { } // package only constructor

    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }
}

class Motorcycle implements Vehicle {
    Motorcycle() { } // package only constructor

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started.");
    }
}

public class SecuredFactory {

    public static Vehicle getVehicle(String type) {
        if (type.equalsIgnoreCase("CAR")) {
            return new Car();
        } else if (type.equalsIgnoreCase("MOTORCYCLE")) {
            return new Motorcycle();
        }
        return null;
    }
}
