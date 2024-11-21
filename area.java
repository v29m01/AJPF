import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();
        double area = side * side;
        double perimeter = 4 * side;
        System.out.println("Area of the square: " + area);
        System.out.println("Perimeter of the square: " + perimeter);
        scanner.close();
    }
}
