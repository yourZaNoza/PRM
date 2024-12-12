package iw_5_1;

import iw_5_1.details.*;
import iw_5_1.professions.*;
import iw_5_1.vehicles.*;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("Ivan Ivanov", 40, 15);
        Engine engine = new Engine(150.0, "Toyota");
        Car car = new Car("Toyota", "Sedan", 1500.0, driver, engine);

        Lorry lorry = new Lorry("Volvo", "Truck", 5000.0, driver, engine, 10000.0);
        SportCar sportCar = new SportCar("Ferrari", "Sport", 1200.0, driver, engine, 300.0);

        car.start();
        car.turnRight();
        car.turnLeft();
        car.stop();

        System.out.println(car.toString());
        System.out.println(lorry.toString());
        System.out.println(sportCar.toString());
    }
}

