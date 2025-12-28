package Strings;

import java.util.*;

public class AscDscStr {
    public static void main(String[] args) {
        String str = "Programming".toLowerCase();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.println("the ascending order is " + new String(arr));

        StringBuilder sb = new StringBuilder(new String(arr));
        System.out.println("the descending order is " + sb.reverse());
    }
}
