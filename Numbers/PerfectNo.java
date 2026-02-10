package Numbers;

public class PerfectNo {
    public static boolean isPerfect(int n) {
        int sum = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i == n || i == 1) {
                    sum += i;
                } else {
                    sum += i + n / i;
                }
            }
        }
        return sum == n;
    }

    public static void main(String[] args) {
        boolean ex1 = isPerfect(6);
        boolean ex2 = isPerfect(15);
        boolean ex3 = isPerfect(28);

        if (ex1) {
            System.out.println("6 is a perfect number");
        } else {
            System.out.println("6 is not a perfect Number");
        }
        if (ex2) {
            System.out.println("15 is a perfect number");
        } else {
            System.out.println("15 is not a perfect Number");
        }
        if (ex3) {
            System.out.println("28 is a perfect number");
        } else {
            System.out.println("28 is not a perfect Number");
        }

    }
}
