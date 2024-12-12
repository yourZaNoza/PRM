package iw_5_1.vehicles;

import iw_5_1.details.Engine;
import iw_5_1.professions.Driver;

public class Lorry extends Car {
    private double cargoCapacity;

    public Lorry(String brand, String carClass, double weight, Driver driver, Engine engine, double cargoCapacity) {
        super(brand, carClass, weight, driver, engine);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String toString() {
        return "Грузовик: грузоподъемность = " + cargoCapacity + ", " + super.toString();
    }
}