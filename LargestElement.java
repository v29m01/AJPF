public class LargestElement {
    public static void main(String[] args) {
        int[] numbers = {34, 78, 12, 56, 89};
        int largest = numbers[0];

        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }
        }

        System.out.println("The largest element in the array is: " + largest);
    }
}
