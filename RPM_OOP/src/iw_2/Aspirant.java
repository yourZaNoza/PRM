package iw_2;

public class Aspirant extends Student {
    private String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    @Override // aннотацияs
    public double getScholarship() {
        if (getAverageMark() == 5) {
            return 10000;
        } else {
            return 5500;
        }
    }

    public String getScientificWork() {
        return scientificWork;
    }
}

