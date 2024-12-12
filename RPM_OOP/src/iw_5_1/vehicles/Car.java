package iw_5_1.vehicles;

import iw_5_1.details.Engine;
import iw_5_1.professions.Driver;

public class Car {
    private String brand;
    private String carClass;
    private double weight;
    private Driver driver;
    private Engine engine;

    public Car(String brand, String carClass, double weight, Driver driver, Engine engine) {
        this.brand = brand;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "\nМашина: " +
                "бренд = " + brand +
                ",\n класс = " + carClass +
                ",\n вес = " + weight +
                ",\n водитель = " + driver +
                ",\n двигатель = " + engine + "\n";
    }
}
