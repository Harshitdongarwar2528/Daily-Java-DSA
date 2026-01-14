package Arrays;

class Max {
    public int SubArray(int[] arr) {
        int n = arr.length;

        int pref = 1;
        int suff = 1;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (pref == 0)
                pref = 1;

            if (suff == 0)
                suff = 1;

            pref *= arr[i];

            suff *= arr[n - i - 1];

            ans = Math.max(ans, Math.max(pref, suff));
        }
        return ans;
    }
}

public class MaxProductSubArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 0, 2 };
        Max m = new Max();
        System.out.println("The maximum product of subarray is " + m.SubArray(arr));
    }
}
