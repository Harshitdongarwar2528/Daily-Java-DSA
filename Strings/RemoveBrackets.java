package Strings;

import java.util.Scanner;

class RB {
    public String RemBrac(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c != '[' && c != ']' && c != '{' && c != '}' && c != '(' && c != ')') {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

public class RemoveBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        RB r = new RB();
        System.out.println("Original String : " + s);
        System.out.println("The updated String is " + r.RemBrac(s));
        sc.close();
    }
}
