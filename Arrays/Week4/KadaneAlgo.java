package Arrays.Week4;

 class Kadance {
    public int maxSubArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}

public class KadaneAlgo {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        Kadance k = new Kadance();
        System.out.println("Maximum sum is " + k.maxSubArray(arr));
    }
}
