package Strings;

import java.util.Arrays;
import java.util.Scanner;

class Maximum {
    public char getMaxOccuringChar(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        int maxFreq = 1, currFreq = 1;
        char maxChar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currFreq++;
            } else {
                if (currFreq > maxFreq) {
                    maxFreq = currFreq;
                    maxChar = arr[i - 1];
                }
                currFreq = 1;
            }
        }
        if (currFreq > maxFreq) {
            maxFreq = currFreq;
            maxChar = arr[arr.length - 1];
        }
        return maxChar;
    }
}

public class MaxOccuringChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Maximum m = new Maximum();
        char ans = m.getMaxOccuringChar(str);
        System.out.println("the maximum occuring char is " + ans);
        sc.close();

    }
}
