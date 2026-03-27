// Q. In the intergalactic archive of Planet Xyphor, two ancient data crystals 
// a[] and b[] store encrypted energy signatures. Due to cosmic duplication 
// anomalies, many signatures may repeat within and across the crystals.
//
// The Galactic Council must compute the total number of distinct energy 
// signatures present when both crystals are merged into a unified repository.
//
// If a signature appears multiple times, it must be counted only once.
//
// Your task is to determine the number of unique energy signatures 
// after combining both arrays.
//
// Example:
// Input:
// a[] = [1, 2, 3, 4, 5]
// b[] = [1, 2, 3]
//
// Output:
// 5
//
// Explanation:
// After merging both arrays → [1,2,3,4,5,1,2,3]
// Distinct elements → [1,2,3,4,5]
// Count = 5

package Logic_Problems;
import java.util.*;

public class UniqueElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        HashSet<Integer> s = new HashSet<>();

        for (int i = 0; i < n; i++) {
            s.add(arr1[i]);
        }
        for (int i = 0; i < m; i++) {
            s.add(arr2[i]);
        }

        System.out.println(s.size());
        sc.close();
    }
}