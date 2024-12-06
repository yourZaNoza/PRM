package rpm_6.interfaces;

public abstract class AbstractAnimal implements Animal {
    private String name;
    private int age;
    private String owner;

    public abstract void say();

    public void setName(String name) { this.name = name;}
    public String getName() {return name;}
    public void setAge(int age) { this.age = age; }
    public int getAge() {return age;}
    public void setOwner(String owner) { this.owner = owner;}
    public String getOwner() {return owner;}
}
