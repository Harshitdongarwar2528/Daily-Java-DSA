package Numbers;

import java.util.*;

public class AreaOfCircle {

    public static void areaOfCircle(int n) {

        double ans = 3.14 * n * n; // Area of circle = πr2
        System.out.print("Area of circle is : " + ans);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        areaOfCircle(n);
        sc.close();
    }
}
