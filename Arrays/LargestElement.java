package Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 8, 2, 6, 1 };
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("The largest number is " + largest);
    }
}
