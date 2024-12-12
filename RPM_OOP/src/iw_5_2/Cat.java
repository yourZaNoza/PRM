package iw_5_2;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяу!");
    }

    @Override
    public void eat() {
        System.out.println("Коты пьют молоко");
    }

    @Override
    public String getDescription() {
        return "Коты милые и пушистые.";
    }
}
