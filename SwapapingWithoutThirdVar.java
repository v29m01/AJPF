public class SwapapingWithoutThirdVar {
    public static void main(String[] args) {
        //Initializing the values for variables
        int a = 6;
        int b = 8;
        System.out.println("Before Swapping: ");
        System.out.println("a = " +a);
        System.out.println("b = "+b);

        // Swapping without temporary variable
        a = a+b;
        b = a-b;
        a = a-b;

        // Printing the swapped values
        System.out.println("After Swapping: ");
        System.out.println("a = " +a);
        System.out.println("b = "+b);
    }
}