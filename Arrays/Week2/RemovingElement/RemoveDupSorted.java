package Arrays.Week2.RemovingElement;

import java.util.HashSet;

class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.contains(num)) {
                seen.add(num);
                nums[index] = num;
                index++;
            }
        }
        return index;
    }
}

public class RemoveDupSorted {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 1, 1, 1, 2, 2, 2, 2, 3, 3, 3 };
        int k = sol.removeDuplicates(nums);

        System.out.println("k :" + k);
        System.out.println("Array after removing duplicates");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}