package Numbers;

import java.util.*;

public class SumInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int sum = 0;

        for (int i = l; i <= r; i++) {
            sum += i;
        }
        System.out.println("the sum in the given range is " + sum);
        sc.close();
    }
}
