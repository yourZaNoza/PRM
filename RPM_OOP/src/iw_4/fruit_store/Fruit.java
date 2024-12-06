package iw_4.fruit_store;

public abstract class Fruit {
    protected double weight;

    public Fruit(double weight) {
        this.weight = weight;
    }

    public final void printManufacturerInfo() {
        System.out.println("Made in Russian Federation");
    }

    public abstract double getPrice();
}

