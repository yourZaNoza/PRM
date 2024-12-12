package iw_5_2;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Гав! Гав!");
    }

    @Override
    public void eat() {
        System.out.println("Собаки едят мясо.");
    }

    @Override
    public String getDescription() {
        return "Собака - друг человека.";
    }
}
