package rpm_6.interfaces;

public class Cat extends AbstractAnimal{
    public void say() {
        System.out.println("Meow!");
    }
    public String getAnimalType() {
        return "Cat";
    }
}

