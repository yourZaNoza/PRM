package iw_4.fruit_store;

public class Pear extends Fruit {

    public Pear(double weight) {
        super(weight);
    }

    @Override
    public double getPrice() {
        return weight * 50;
    }
}
