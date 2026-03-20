// A strong number is a number whose sum of the factorials of its digits is equal to the number itself.
package Numbers;

public class StrongNo {
    public static int Factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }
        return fact;
    }

    public static int Strong_No(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += Factorial(digit);
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 125;
        int ans = Strong_No(number);
        if (ans == number && number != 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
