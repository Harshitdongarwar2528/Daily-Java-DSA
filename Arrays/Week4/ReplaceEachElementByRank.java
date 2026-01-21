package Arrays.Week4;

import java.util.Arrays;
import java.util.HashMap;

class Replace {
    public int[] replaceWithRank(int[] arr) {
        int[] sortedArr = arr.clone();

        // Sort the copied array
        Arrays.sort(sortedArr);

        // Map to store rank of each unique number
        HashMap<Integer, Integer> rankMap = new HashMap<>();

        int rank = 1;

        // Assign rank to each unique number
        for (int num : sortedArr) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank);
                rank++;
            }
        }

        // Replace elements in original array with their ranks
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = rankMap.get(arr[i]);
        }

        return result;
    }
}

public class ReplaceEachElementByRank {
    public static void main(String[] args) {
        int[] arr = { 1, 9, 4, 5, 2 };
        Replace obj = new Replace();
        int[] res = obj.replaceWithRank(arr);
        for (int x : res) {
            System.out.print(x + " ");
        }

    }
}