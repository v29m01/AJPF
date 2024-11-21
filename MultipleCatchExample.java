public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e);
        } catch (Exception e) {
            System.out.println("General Exception caught: " + e);
        }
    }
}
