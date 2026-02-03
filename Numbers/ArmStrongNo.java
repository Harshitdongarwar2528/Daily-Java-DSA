package Numbers;

public class ArmStrongNo {
    public static boolean isArmstrong(int num) {
        int k = String.valueOf(num).length();
        int sum = 0;
        int n = num;

        while (n > 0) {
            int ld = n % 10; // last digit
            sum += Math.pow(ld, k); // add ld^k
            n /= 10; // remove digit

        }
        return sum == num;
    }

    public static void main(String[] args) {
        int number = 153;

        if (isArmstrong(number)) {
            System.out.println(number + " is an armstrong number ");
        } else {
            System.out.println(number + " is not an armstrong number ");
        }
    }
}