package Arrays.Week4;

class EqiIdx {
    public static int findEquilibriumIdx(int[] nums, int n) {
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
        }
        int leftSum = 0, rightSum = totalSum;

        for (int i = 0; i < n; i++) {
            rightSum -= nums[i];

            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}

public class Equilibrium {
    public static void main(String[] args) {
        int[] arr = { 2, 3, -1, 8, 4 };
        int n = arr.length;
        int equilibriumIdx = EqiIdx.findEquilibriumIdx(arr, n);
        System.out.println(equilibriumIdx);
    }
}
