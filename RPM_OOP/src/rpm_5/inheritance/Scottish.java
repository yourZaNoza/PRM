package rpm_5.inheritance;

public class Scottish extends Cat{
    private String name;
    public Scottish(int age, String owner, String name) {
        super(age, owner);
    }
    // public void setName(String name) {this.name = name;}
    public String getName() {return name;}

    @Override
    public String toString() {
        return "Имя кота: " + name + ", возраст кота: " + getAge() + ", родитель: " + getOwner();
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() == o.getClass()) {
            Scottish outsideObject = (Scottish) o;
            return name.equals(outsideObject.name)
                    && getAge() == outsideObject.getAge()
                    && getOwner() == outsideObject.getOwner();
        }
        return false;
    }
}

