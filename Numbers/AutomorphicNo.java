// An Automorphic number is a number whose square ends with the same digits as the number itself.
package Numbers;

class Auto {
    public boolean isAutomorphic(int N) {
        int sq = N * N;

        while (N > 0) {
            if (N % 10 != sq % 10) {
                return false;

            }
            N /= 10;
            sq /= 10;
        }
        return true;
    }
}

public class AutomorphicNo {
    public static void main(String[] args) {
        int N = 6;
        Auto a = new Auto();
        if (a.isAutomorphic(N)) {
            System.out.println("Automorphic Number");

        } else {
            System.out.println("Not Automorphic Number");
        }
    }
}
