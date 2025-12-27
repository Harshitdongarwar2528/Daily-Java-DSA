package Strings;

public class ReverseStr{
    public static void Reverse(char[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

    }

    public static void main(String[] args) {
        String str = "abcdefghijk".toLowerCase();
        char[] arr = str.toCharArray();
        System.out.print("the original string is ");
        printString(arr);

        Reverse(arr);

        System.out.print("the reversed String is ");
        printString(arr);

    }

    public static void printString(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
