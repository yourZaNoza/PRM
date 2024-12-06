package dz_4.entity;

public class Hotel {
    private String name;
    private Room[] roomes;

    public Hotel(String name, Room[] roomes) {
        this.name= name;
        this.roomes = roomes;
    }

    public String getName() {return name;}

    public void setName(String name) {
        this.name = name;
    }

    public Room[] getRoomes() {
        return roomes;
    }

    public void setRoomes(Room[] roomes) {
        this.roomes = roomes;
    }
}
