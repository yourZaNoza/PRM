package iw_4.fruit_store;

public class Apple extends Fruit {

    public Apple(double weight) {
        super(weight);
    }

    @Override
    public double getPrice() {
        return weight * 30;
    }
}

