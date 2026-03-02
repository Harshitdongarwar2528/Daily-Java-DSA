package Numbers;

public class FibonacciSeriesUptoN{
    public static void main(String[] args) {
        int n = 5;

        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int secondLast = 0;
        int last = 1;

        System.out.println("The Fibonacci Series upto " + n + " terms:");

        if (n >= 1)
            System.out.print(secondLast + " ");
        if (n >= 2)
            System.out.print(last + " ");

        for (int i = 3; i <= n; i++) {
            int cur = secondLast + last;
            System.out.print(cur + " ");
            secondLast = last;
            last = cur;
        }
    }
}