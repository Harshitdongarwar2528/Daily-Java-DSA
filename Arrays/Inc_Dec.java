package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class Inc_Dec {
    public static void main(String[] args) {
        Integer[] arr = { 1, 3, 2, 6, 2, 8, 9, 2 };

        System.out.println("The original array is " + Arrays.toString(arr));

        // Increasing Order
        Arrays.sort(arr);
        System.out.println("The Increasing order is " + Arrays.toString(arr));

        // Decsreasing Order
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("The Decreasing Order is " + Arrays.toString(arr));
    }
}
