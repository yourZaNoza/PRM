package iw_6.animals;

class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Cat{name='" + getName() + "'}";
    }
}
