import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int originalNum = num;
        int reversedNum = 0;

        // Reversing the number
        while (num != 0) {
            int digit = num % 10;  // Get last digit
            reversedNum = reversedNum * 10 + digit;  // Build the reversed number
            num /= 10;  // Remove last digit from num
        }

        // Check if the number is a palindrome
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }

        scanner.close();
    }
}
