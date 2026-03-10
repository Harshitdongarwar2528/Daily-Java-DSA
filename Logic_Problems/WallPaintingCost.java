package Logic_Problems;

import java.util.*;

public class WallPaintingCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Ent walls");
        int ni = sc.nextInt();
        System.out.println("Enter Ext walls");
        int ne = sc.nextInt();

        float interiorPrice = 18;
        float exteriorPrice = 12;

        float cost = 0;
        float area;

        if (ni < 0 || ne < 0) {
            System.out.println("INVALID INPUT");
            sc.close();
            return;
        }
        if (ni == 0 && ne == 0) {
            System.out.println("Total estimated Cost : 0.0");
            sc.close();
            return;
        }
        for (int i = 0; i < ni; i++) {
            area = sc.nextFloat();
            cost += area * interiorPrice;
        }
        for (int i = 0; i < ne; i++) {
            area = sc.nextFloat();
            cost += area * exteriorPrice;
        }
        System.out.printf("Total estimated Cost : %.1f", cost);
        sc.close();
    }
}