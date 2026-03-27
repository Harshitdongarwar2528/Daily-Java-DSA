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