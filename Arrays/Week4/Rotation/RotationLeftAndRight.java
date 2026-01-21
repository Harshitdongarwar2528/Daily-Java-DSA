package Arrays.Week4.Rotation;

import java.util.Arrays;

class Rotation {
    void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public int[] rotateArray(int[] arr, int d, String direction) {
        int n = arr.length;

        if (n == 0 || d == 0)
            return arr;
        d = d % n;

        // for right rotation
        if (direction.equals("right")) {
            // step 1 : reverse an entire array
            reverseArray(arr, 0, n - 1);
            // step 2 : reverse first k elements
            reverseArray(arr, 0, d - 1);
            // step 3 : reverse remaining n- k elements
            reverseArray(arr, d, n - 1);

        }
        // If rotation is to the left
        else if (direction.equals("left")) {
            // Step 1: reverse first k elements

            reverseArray(arr, 0, d - 1);
            // Step 2: reverse remaining n-k elements

            reverseArray(arr, d, n - 1);
            // Step 3: reverse entire array

            reverseArray(arr, 0, n - 1);
        }
        return arr;
    }
}

public class RotationLeftAndRight {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        Rotation r = new Rotation();
        int k = 2;
        String direction = "right";
        System.out.println("the original array is " + Arrays.toString(arr));
        int[] result = r.rotateArray(arr, k, direction);
        System.out.println("the rotated array is " + Arrays.toString(result));
        // for(int nums : result){
        // System.out.print(nums+" ");
        // }
    }
}
