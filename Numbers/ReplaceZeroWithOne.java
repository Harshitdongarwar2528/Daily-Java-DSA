package Numbers;
import java.util.*;

class Replace {
    public int replaceZeroAndOne(int N) {
        String num = Integer.toString(N);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == '0') {
                result.append('1');
            } else {
                result.append(num.charAt(i));
            }
        }
        return Integer.parseInt(result.toString());
    }
}

public class ReplaceZeroWithOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   // FIXED: int not String
        Replace r = new Replace();
        System.out.println(r.replaceZeroAndOne(N)); // FIXED: use object
        sc.close();
    }
}