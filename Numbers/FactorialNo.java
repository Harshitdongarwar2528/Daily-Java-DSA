package Numbers;

public class FactorialNo {
    public static int factor(int x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int x = 5;
        int result = factor(x);

        System.out.println("The Factorial Number of " + x + " is " + result);
    }
}
