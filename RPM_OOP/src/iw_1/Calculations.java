package iw_1;

public class Calculations {
    public static double calculateRectangleArea(Rectangle rectangle) {
        return rectangle.getLength() * rectangle.getWidth();
    }

    public static double calculateRectanglePerimeter(Rectangle rectangle) {
        return 2 * (rectangle.getLength() + rectangle.getWidth());
    }

    public static double calculateTriangleArea(Triangle triangle) {
        double s = (triangle.getSideA() + triangle.getSideB() + triangle.getSideC()) / 2;
        return Math.sqrt(s * (s - triangle.getSideA()) * (s - triangle.getSideB()) * (s - triangle.getSideC()));
    }

    public static double calculateTrianglePerimeter(Triangle triangle) {
        return triangle.getSideA() + triangle.getSideB() + triangle.getSideC();
    }
}
