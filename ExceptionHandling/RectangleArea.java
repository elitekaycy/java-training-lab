package ExceptionHandling;

public class RectangleArea {
    public static double calculateRectangleArea(int width, int height) {
        double area = 0;
        try {
            area = width * height;
            if (width == 0 || height == 0) {
                throw new ArithmeticException("Width or height cannot be zero");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return area;
    }
}
