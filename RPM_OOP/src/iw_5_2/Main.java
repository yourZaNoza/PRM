package iw_5_2;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Бобик"),
                new Cat("Мурзик"),
                new Bear("Балу")
        };

        Veterinarian vet = new Veterinarian();
        System.out.println("");
        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
        System.out.println("");
        for (Animal animal : animals) {
            animal.makeNoise();
            animal.eat();
        }
    }
}
