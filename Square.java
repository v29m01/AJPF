import java.util.Scanner;

public class Square {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the side length of the square
        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();

        // Calculate the area of the square (Area = side * side)
        double area = side * side;

        // Calculate the perimeter of the square (Perimeter = 4 * side)
        double perimeter = 4 * side;

        // Display the calculated area and perimeter
        System.out.println("Area of the square: " + area);
        System.out.println("Perimeter of the square: " + perimeter);
        scanner.close();
    }
    
}