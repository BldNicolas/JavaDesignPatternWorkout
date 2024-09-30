package dp.factory.structure;

import dp.factory.Car;
import dp.factory.Motorcycle;

public class VehicleFactory {

	public static Vehicle getVehicle(int numberOfWheels) {
		switch (numberOfWheels) {
		case 4:
			return new Car();
		case 2:
			return new Motorcycle();
		default:
			return null;
		}
	}

	public static Vehicle getVehicle(String name) {
		switch (name) {
		case "Voiture":
			return new Car();
		case "Moto":
			return new Motorcycle();
		default:
			return null;
		}
	}
}
