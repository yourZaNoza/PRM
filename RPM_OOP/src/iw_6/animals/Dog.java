package iw_6.animals;

class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Dog{name='" + getName() + "'}";
    }
}
