package Logic_Problems;

import java.util.*;

public class GuestsLeavingAndStaying {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] Entering = new int[n];
        int[] Leaving = new int[n];

        for (int i = 0; i < n; i++) {
            Entering[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            Leaving[i] = sc.nextInt();
        }
        int currentGuests = 0;
        int maxGuests = 0;

        for (int i = 0; i < n; i++) {
            currentGuests = currentGuests + Entering[i] - Leaving[i];

            if (currentGuests > maxGuests) {
                maxGuests = currentGuests;
            }
        }
        System.out.println(maxGuests);

        sc.close();
    }

}
