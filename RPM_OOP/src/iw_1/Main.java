package iw_1;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5, 10);
        Rectangle rectangle2 = new Rectangle(7, 14);

        Triangle triangle1 = new Triangle(3, 4, 5);
        Triangle triangle2 = new Triangle(6, 8, 10);

        System.out.println("Площадь прямоугольника_1: " + Calculations.calculateRectangleArea(rectangle1));
        System.out.println("Периметр прямоугольника_1: " + Calculations.calculateRectanglePerimeter(rectangle1) + "\n");

        System.out.println("Площадь прямоугольника_2: " + Calculations.calculateRectangleArea(rectangle2));
        System.out.println("Периметр прямоугольника_2: " + Calculations.calculateRectanglePerimeter(rectangle2) + "\n");

        System.out.println("Площадь треугольника_1: " + Calculations.calculateTriangleArea(triangle1));
        System.out.println("Периметр треугольника_1: " + Calculations.calculateTrianglePerimeter(triangle1) + "\n");

        System.out.println("Площадь треугольника_2: " + Calculations.calculateTriangleArea(triangle2));
        System.out.println("Периметр треугольника_2: " + Calculations.calculateTrianglePerimeter(triangle2) + "\n");
    }
}

