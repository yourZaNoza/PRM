package iw_4.flower_store;

public class Rose extends Flower {
    public Rose(String country, int shelfLife, double price) {
        super(country, shelfLife, price);
    }

    @Override
    public String getType() {
        return "Роза";
    }
}

