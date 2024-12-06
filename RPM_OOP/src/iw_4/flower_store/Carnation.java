package iw_4.flower_store;

public class Carnation extends Flower {
    public Carnation(String country, int shelfLife, double price) {
        super(country, shelfLife, price);
    }

    @Override
    public String getType() {
        return "Гвоздика";
    }
}

