package Numbers;

import java.util.*;

class PrimeNoInRange {
    public List<Integer> segmentedSieve(int a, int b) {
        int limit = (int) Math.sqrt(b);
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i)
                    isPrime[j] = false;
            }
        }
        List<Integer> smallPrimes = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i])
                smallPrimes.add(i);
        }
        boolean[] isPrimeRange = new boolean[b - a + 1];
        Arrays.fill(isPrimeRange, true);
        for (int p : smallPrimes) {
            int start = Math.max(p * p, ((a + p - 1) / p) * p);
            for (int j = start; j <= b; j += p)
                isPrimeRange[j - a] = false;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < isPrimeRange.length; i++) {
            if (isPrimeRange[i] && (i + a) > 1)
                result.add(i + a);
        }
        return result;
    }
}

public class PrimeRange {
    public static void main(String[] args) {
        int a = 10, b = 30;
        PrimeNoInRange pn = new PrimeNoInRange();
        List<Integer> primes = pn.segmentedSieve(a, b);
        for (int p : primes) {
            System.out.println(p + " ");
        }
        System.out.println();
    }
}
