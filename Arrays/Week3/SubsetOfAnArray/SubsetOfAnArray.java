package Arrays.Week3.SubsetOfAnArray;

import java.util.Arrays;

class Subset {
    // Function to perform binary search to check if an element is present in the
    // array

    public boolean bSerach(int elem, int[] arr, int n) {
        int start = 0;
        int end = n - 1;
        // Perform binary search

        while (start <= end) {
            int mid = (start + end) / 2;
            // If element is found, return true

            if (arr[mid] == elem)
                return true;
            // If the element is greater than mid, search in the right half

            else if (arr[mid] < elem)
                start = mid + 1;
            // If the element is smaller than mid, search in the left half

            else
                end = mid - 1;
        }
        return false;
    }
    // Function to check if arr1[] is a subset of arr2[]

    public boolean isSubset(int[] arr1, int m, int[] arr2, int n) {
        // Sort arr2[] for efficient binary search

        Arrays.sort(arr2);
        // For each element in arr1[], check if it exists in arr2[]

        if (m > n)
            return false;

        for (int i = 0; i < m; i++) {
            boolean present = bSerach(arr1[i], arr2, n);
            // If any element from arr1[] is not present in arr2[], return false

            if (!present)
                return false;
        }
        return true;
    }
}

public class SubsetOfAnArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 2 };
        int[] arr2 = { 1, 3, 4, 2, 5, 6, 8 };

        int m = arr1.length;
        int n = arr2.length;

        Subset s = new Subset();

        boolean ans = s.isSubset(arr1, m, arr2, n);

        if (ans) {
            System.out.println("arr1[] is a subset of arr2[]");
        } else {
            System.out.println("arr1[] is not a subset of arr[]2");
        }
    }
}
