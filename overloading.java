public class Perimeter {

    // Method to calculate perimeter of a square
    public double calculatePerimeter(double side) {
        return 4 * side;  // Perimeter of square = 4 * s
    }

    // Method to calculate perimeter of a rectangle
    public double calculatePerimeter(double length, double breadth) {
        return 2 * (length + breadth);  // Perimeter of rectangle = 2 * (l + b)
    }

    // Method to calculate perimeter of a circle
    public double calculatePerimeter(double radius, boolean isCircle) {
        return 2 * (22.0 / 7.0) * radius;  // Perimeter of circle = 2 * (22/7) * r
    }

    // Main method to test function overloading
    public static void main(String[] args) {
        Perimeter perimeter = new Perimeter();

        // Test: Perimeter of Square
        double squareSide = 5.0;
        System.out.println("Perimeter of Square: " + perimeter.calculatePerimeter(squareSide));

        // Test: Perimeter of Rectangle
        double rectangleLength = 10.0;
        double rectangleBreadth = 5.0;
        System.out.println("Perimeter of Rectangle: " + perimeter.calculatePerimeter(rectangleLength, rectangleBreadth));

        // Test: Perimeter of Circle
        double circleRadius = 7.0;
        System.out.println("Perimeter of Circle: " + perimeter.calculatePerimeter(circleRadius, true));
    }
}
