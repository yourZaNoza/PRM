package iw_4.flower_store;

public abstract class Flower {
    private String country;
    private int shelfLife;
    private double price;
    private static int totalFlowersSold = 0;

    public Flower(String country, int shelfLife, double price) {
        this.country = country;
        this.shelfLife = shelfLife;
        this.price = price;
    }

    public abstract String getType();

    public String getCountry() {
        return country;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public double getPrice() {
        return price;
    }

    public static int getTotalFlowersSold() {
        return totalFlowersSold;
    }

    public static void incrementTotalFlowersSold() {
        totalFlowersSold++;
    }
}
