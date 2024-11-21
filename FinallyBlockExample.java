public class FinallyBlockExample {
    public static void main(String[] args) {
        try {
            int data = 50 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("This is the finally block, always executed.");
        }
    }
}
