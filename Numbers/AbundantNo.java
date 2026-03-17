// An abundant number is a number whose sum of its proper divisors is greater than the number itself.

package Numbers;

import java.util.*;

public class AbundantNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (n / i == 0) {
                    sum += i;
                } else {
                    sum += i;
                    sum += n / i;
                }
            }
        }
        sum -= n;

        if (sum > n) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not a Abundant Number");
        }
        sc.close();
    }
}