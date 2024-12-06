package iw_4.flower_store;

public class Bouquet {
    private Flower[] flowers;

    public Bouquet(Flower[] flowers) {
        this.flowers = flowers;
    }

    public double calculateCost() {
        double totalCost = 0;
        for (Flower flower : flowers) {
            totalCost += flower.getPrice();
            Flower.incrementTotalFlowersSold();
        }
        return totalCost;
    }

    public void displayBouquet() {
        for (Flower flower : flowers) {
            System.out.println("Цветок: " + flower.getType() + ", Страна: " + flower.getCountry() + ", Срок хранения (дни): " + flower.getShelfLife() + ", Цена: " + flower.getPrice());
        }
    }
}
