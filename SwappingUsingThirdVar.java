public class SwappingUsingThirdVar {
    public static void main(String[] args) {
        //Initializing the values of the variables
        int a =6;
        int b =8;

        System.out.println("Before swapping:");
        System.out.println("a = " +a);
        System.out.println("b = " +b);

        //Swapping the variable's value
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:");
        //Printing the swapped values
        System.out.println("a = " +a);
        System.out.println("b = " +b);
    }
}