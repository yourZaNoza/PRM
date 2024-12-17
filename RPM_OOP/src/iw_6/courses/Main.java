package iw_6.courses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Igor Igorev", "Group IS-31", 1, List.of(4, 3, 3)));
        students.add(new Student("Dima Dmitriev", "Group IS-22", 2, List.of(2, 2, 2)));
        students.add(new Student("Zoia Zoevna", "Group IS-33", 3, List.of(5, 5, 4)));

        removeStudentsWithLowAverage(students);
        promoteStudents(students);

        printStudents(students, 2);
    }

    public static void removeStudentsWithLowAverage(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3) {
                System.out.println("Удален студент: " + student.getName() + " (средний балл: " + student.getAverageGrade() + ")");
                iterator.remove();
            }
        }
    }

    public static void promoteStudents(List<Student> students) {
        for (Student student : students) {
            if (student.getAverageGrade() >= 3) {
                int newCourse = student.getCourse() + 1;
                System.out.println("Студент " + student.getName() + " переведен на курс " + newCourse);
                student.setCourse(newCourse);
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName() + ", курс " + student.getCourse());
            }
        }
    }
}

