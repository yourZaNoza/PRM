package iw_4.flower_store;

public class Lily extends Flower {
    public Lily(String country, int shelfLife, double price) {
        super(country, shelfLife, price);
    }

    @Override
    public String getType() {
        return "Лилия";
    }
}

