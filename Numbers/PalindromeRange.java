package Numbers;

public class PalindromeRange {
    public static void main(String[] args) {
        int start = 1;
        int end = 200;

        System.out.println("Palindrome between " + start + " and till " + end + " are the following");
        for (int i = start; i <= end; i++) {
            if (isPalindrome(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        return original == reversed;
    }
}