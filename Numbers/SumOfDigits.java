package Numbers;

import java.util.*;

class SumDigits {
    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        SumDigits s = new SumDigits();
        System.out.println(s.addDigits(num));
        sc.close();

    }
}