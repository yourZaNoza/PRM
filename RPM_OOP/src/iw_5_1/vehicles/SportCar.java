package iw_5_1.vehicles;

import iw_5_1.details.Engine;
import iw_5_1.professions.Driver;

public class SportCar extends Car {
    private double maxSpeed;

    public SportCar(String brand, String carClass, double weight, Driver driver, Engine engine, double maxSpeed) {
        super(brand, carClass, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "СпортКар: максимальная скорость = " + maxSpeed + ", " + super.toString();
    }
}
