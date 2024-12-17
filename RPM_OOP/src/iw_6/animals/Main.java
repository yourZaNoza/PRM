package iw_6.animals;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Pet> pets = new HashMap<>();

        pets.put("Lori", new Cat("Lori"));
        pets.put("Martin", new Dog("Martin"));
        pets.put("Kesha", new Parrot("Kesha"));

        printPetNames(pets);
    }

    public static void printPetNames(Map<String, Pet> pets) {
        System.out.println("Names:");
        for (String name : pets.keySet()) {
            System.out.println(name);
        }
    }
}

