package Arrays.Week1;

class Solution {
    public int arraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}

public class SumOfElements {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = { 1, 2, 3, 4 };
        System.out.println("The Total is " + s.arraySum(arr));

    }
}
