package Numbers.PrimeRange.BruteForce;

import java.util.ArrayList;
import java.util.List;

public class Prime {

    public boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> getPrimes(int a, int b) {
        List<Integer> primes = new ArrayList<>();

        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        int a = 10, b = 20;

        Prime p = new Prime();
        List<Integer> primes = p.getPrimes(a, b);

        System.out.println("Prime Numbers:");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
        System.out.println();
    }
}
