import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is even or odd using the conditional operator
        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println("The number is: " + result);

        sc.close(); // Close the scanner
    }
}
