import java.util.Scanner;

public class evenoddcheckthird{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Using a third variable to hold the result
        String result;
        if (number % 2 == 0) {
            result = "Even";
        } else {
            result = "Odd";
        }

        System.out.println("The number is: " + result);

        sc.close(); // Close the scanner
    }
}
