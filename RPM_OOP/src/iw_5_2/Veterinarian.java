package iw_5_2;

public class Veterinarian {

    public void treatAnimal(Animal animal) {
        System.out.println("Пациент: " + animal.getName());
        System.out.println("Описание: " + animal.getDescription());
    }
}
