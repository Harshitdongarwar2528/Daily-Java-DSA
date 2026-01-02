package Arrays;

import java.util.Arrays;

class Median {
    public void medianArray(int[] arr, int n) {
        Arrays.sort(arr);
        if (n % 2 == 0) {
            int ind1 = (n / 2) - 1;
            int ind2 = (n / 2);
            System.out.println((double) (arr[ind1] + arr[ind2]) / 2);
        } else {
            System.out.println(arr[n / 2]);
        }
    }
}

public class MedianArray {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 7 };
        int n = 4;
        Median m = new Median();
        System.out.println("The median of Array is ");
        m.medianArray(arr, n);
    }
}