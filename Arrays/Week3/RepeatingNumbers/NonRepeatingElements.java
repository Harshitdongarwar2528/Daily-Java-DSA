package Arrays.Week3.RepeatingNumbers;

import java.util.Arrays;

class Solutionss {
    public void nonRepeat(int[] arr) {
        Arrays.sort(arr);
        if (arr[0] != arr[1]) {
            System.out.println(arr[0] + " ");
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] != arr[i] && arr[i] != arr[i + 1]) {
                System.out.println(arr[i] + " ");
            }
        }
        if (arr[arr.length - 2] != arr[arr.length - 1]) {
            System.out.println(arr[arr.length - 1] + " ");
        }
    }
}

public class NonRepeatingElements {
    public static void main(String[] args) {
        int[] arr = { 1, -1, 1, 2, 3, 2, 4 };
        Solutionss s = new Solutionss();
        System.out.println("The Non-Repeating Elements In an Array");
        s.nonRepeat(arr);
    }
}