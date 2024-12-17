package iw_6.animals;

class Parrot extends Pet {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Parrot{name='" + getName() + "'}";
    }
}