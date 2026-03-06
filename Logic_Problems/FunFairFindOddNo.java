// At a fun fair, a street vendor is selling different colours of balloons. He sells N number of different colours of balloons (B[]). The task is to find the colour (odd) of the balloon which is present odd number of times in the bunch of balloons.

// Note: If there is more than one colour which is odd in number, then the first colour in the array which is present odd number of times is displayed. The colours of the balloons can all be either upper case or lower case in the array. If all the inputs are even in number, display the message “All are even”.

// Example 1:

// 7  -> Value of N
// [r,g,b,b,g,y,y]  -> B[] Elements B[0] to B[N-1], where each input element is sepārated by ṉew line.
// Output :

// r -> [r,g,b,b,g,y,y]  -> “r” colour balloon is present odd number of times in the bunch.
// Explanation:
// From the input array above:

// r: 1 balloon 
// g: 2 balloons
// b:  2 balloons
// y : 2 balloons
// Hence , r is only the balloon which is odd in number.
package Logic_Problems;

import java.util.*;

public class FunFairFindOddNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of balloons:");
        int n = sc.nextInt();

        String[] arr = new String[n];

        System.out.println("Enter balloon colours:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        boolean found = false;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }

            if (count % 2 != 0) {
                System.out.println(arr[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("All are even");
        }

        sc.close();
    }
}