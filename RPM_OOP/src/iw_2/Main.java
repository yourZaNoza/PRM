package iw_2;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Andrei", "Petrov", "Group1", 3.8),
                new Student("Anna", "Karenina", "Group2", 5.0),
                new Aspirant("Faina", "Ranevskaya", "Group3", 4.8, "Theater"),
                new Aspirant("Fedor", "Dostoevski", "Group4", 5.0, "Litrature")
        };

        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " scholarship: " + student.getScholarship());
        }
    }
}

