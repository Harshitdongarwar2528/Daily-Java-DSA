package Arrays.Week1;

public class SecondLargest_Smallest {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 1, 6, 9, 3, 1 };
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {

            // for second largest element

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }

            // for second smallest element

            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        // print the second largest and smallest element
        System.out.println("the second largest element is " + secondLargest);
        System.out.println("the second smallest element is " + secondSmallest);
    }
}
