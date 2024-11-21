public class NarrowingCasting {
    public static void main(String[] args) {
        double num = 9.78;
        int intNum = (int) num;
        System.out.println("Original double value: " + num);
        System.out.println("Narrowed int value: " + intNum);
    }
}
