package Strings;

public class IsPalindrome {
    public static boolean isPalin(String str) {
        str = str.replaceAll("\\s", "");
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "NursesRun".toLowerCase();
        if (isPalin(str)) {
            System.out.println("its a palindrome String");
        } else {
            System.out.println("its not a palindrome String");
        }
    }
}
