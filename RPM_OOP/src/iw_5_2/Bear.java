package iw_5_2;

public class Bear extends Animal {

    public Bear(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Грр!");
    }

    @Override
    public void eat() {
        System.out.println("Медведи едят рыбу.");
    }

    @Override
    public String getDescription() {
        return "Медведь - это большое дикое животное.";
    }
}
