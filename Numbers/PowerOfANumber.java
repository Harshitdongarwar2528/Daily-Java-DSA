package Numbers;

public class PowerOfANumber {
    static double myPow(double x, int n) {
        double ans = 1;

        if (x == 0 || x == 1) {
            return x;
        }

        if (n < 0) {
            x = 1 / x;
            n = -(n + 1);
            ans = ans * x;
        }
        while (n > 0) {
            if (n % 2 == 1) {
                ans = ans * x;
                n = n - 1;
            } else {
                n = n / 2;
                x = x * x;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        double x = 2;
        int n = 21;

        System.out.println("Base: " + x);
        System.out.println("Power " + n);

        double result = myPow(x, n);
        System.out.println("Result: " + result);

    }
}
