package NumberSystem;

import java.util.*;

class BTD {
    public int BinaryToDecimal(String str) {
        return Integer.parseInt(str, 2);
    }
}

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        BTD b = new BTD();
        System.out.println(b.BinaryToDecimal(str));
        sc.close();
    }
}
