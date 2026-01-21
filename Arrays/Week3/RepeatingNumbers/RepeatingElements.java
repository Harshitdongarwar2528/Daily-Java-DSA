package Arrays.Week3.RepeatingNumbers;

import java.util.Arrays;

class SOLS {
    public void RepeatElem(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.print(arr[i] + " ");
            }
            ;
        }
    }
}

public class RepeatingElements {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 4, 5, 3, 5 };
        SOLS s = new SOLS();
        s.RepeatElem(arr);
    }
}
