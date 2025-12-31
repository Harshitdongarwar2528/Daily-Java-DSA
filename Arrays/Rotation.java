package Arrays;

import java.util.Arrays;

class Sol {
    void rotation(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    void leftRotation(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        if (d == 0)
            return;
        rotation(arr, 0, d - 1);
        rotation(arr, d, n - 1);
        rotation(arr, 0, n - 1);
    }

    void rightRotation(int[] arr, int d) {
        int n = arr.length;
        leftRotation(arr, n - (d % n));
    }
}

public class Rotation {
    public static void main(String[] args) {
        Sol s = new Sol();
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 2;

        System.out.println("the original array is " + Arrays.toString(arr));

        s.leftRotation(arr, k);
        System.out.println("left Rotation");
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();

        arr = new int[] { 1, 2, 3, 4, 5 };

        s.rightRotation(arr, k);
        System.out.println("Right Rotation");
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }
}