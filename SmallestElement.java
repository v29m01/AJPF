public class SmallestElement {
    public static void main(String[] args) {
        int[] numbers = {34, 78, 12, 56, 89};
        int smallest = numbers[0];

        for (int num : numbers) {
            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("The smallest element in the array is: " + smallest);
    }
}
