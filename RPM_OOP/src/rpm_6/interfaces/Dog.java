package rpm_6.interfaces;

public class Dog extends AbstractAnimal{
    public void say() {
        System.out.println("Woof!");
    }
    public String getAnimalType() {
        return "Dog";
    }
}
