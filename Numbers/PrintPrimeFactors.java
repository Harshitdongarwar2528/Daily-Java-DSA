package Numbers;

import java.util.Scanner;

class Find {
    public void factors(int n) {
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }

    }
}

public class PrintPrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to find ");
        int n = sc.nextInt();
        Find f = new Find();
        f.factors(n);
        sc.close();
    }
}
