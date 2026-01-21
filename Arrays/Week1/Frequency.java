package Arrays.Week1;

import java.util.Arrays;

public class Frequency {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 3, 4, 4, 5 };
        Arrays.sort(arr);
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                System.out.println(arr[i - 1] + " occurs " + count + " times ");
                count = 1;
            }
        }
        System.out.println(arr[arr.length - 1] + " occurs " + count + " times ");
    }
}
