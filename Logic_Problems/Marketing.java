package Logic_Problems;

import java.util.*;

public class Marketing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String parent = sc.nextLine().trim();
        String hasChild = sc.nextLine().trim();

        int schemeAmount = 5000;
        int parentComission = 0;

        List<String> children = new ArrayList<>();

        if (hasChild.equalsIgnoreCase("Y")) {
            String childInput = sc.nextLine().trim();

            if (childInput.contains(",")) {
                String[] childArr = childInput.split(",");
                for (String c : childArr) {
                    children.add(c.trim());
                }
            } else {
                children.add(childInput.trim());
            }
            parentComission = children.size() * (schemeAmount * 10 / 100);
        } else {
            parentComission = schemeAmount * 5 / 100;
        }
        int totalMembers = 1 + children.size();

        System.out.println("Total Members:" + totalMembers);
        System.out.println("Comission Details");
        System.out.println(parent + ": " + parentComission + " INR");

        for (String child : children) {
            int childCommission = schemeAmount * 5 / 100;
            System.out.println(child + " :" + childCommission + " INR");
        }
        sc.close();
    }
}