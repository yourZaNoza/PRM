package iw_4.fruit_store;

public class Aprikot extends Fruit {

    public Aprikot(double weight) {
        super(weight);
    }

    @Override
    public double getPrice() {
        return weight * 75;
    }
}

