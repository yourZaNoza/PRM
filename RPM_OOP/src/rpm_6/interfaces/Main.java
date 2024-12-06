package rpm_6.interfaces;

public class Main {
    public static void main(String[] args) {
        Animal lori = new Cat();
        Animal baxter = new Dog();

        lori.say();
        baxter.say();
    }
    private static void findOwner(Animal animal) {
        if (animal.getClass() == Cat.class) {
            animal.setOwner("Cat_Owner");
        }
        if (animal.getClass() == Dog.class) {
            animal.setOwner("Dog_Owner");
        }
    }
}
