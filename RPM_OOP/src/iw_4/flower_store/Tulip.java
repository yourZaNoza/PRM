package iw_4.flower_store;

public class Tulip extends Flower {
    public Tulip(String country, int shelfLife, double price) {
        super(country, shelfLife, price);
    }

    @Override
    public String getType() {
        return "Тюльпан";
    }
}

