package Strings;

import java.util.*;

public class StrFreq {
    public static void main(String[] args) {
        String str = "Programming".toLowerCase();
        char[] arr = str.toCharArray();
        int count = 1;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                System.out.println(arr[i - 1] + " appears " + count + " times ");
                count = 1;
            }
        }
        System.out.println(arr[arr.length - 1] + " appears " + count + " times ");
    }
}
