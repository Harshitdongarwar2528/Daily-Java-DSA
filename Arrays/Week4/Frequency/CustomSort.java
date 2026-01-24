import java.util.*;
public class CustomSort {
    public static void main(String[] args) {

        int[] arr = {2,1,2,5,7,1,9,3,6,8,8};
        int[] order = {2,1,8,3};

        // position map
        HashMap<Integer, Integer> pos = new HashMap<>();
        for (int i = 0; i < order.length; i++)
            pos.put(order[i], i);

        ArrayList<Integer> list = new ArrayList<>();
        for (int n : arr) list.add(n);

        Collections.sort(list, (a, b) -> {
            if (pos.containsKey(a) && pos.containsKey(b))
                return pos.get(a) - pos.get(b);
            if (pos.containsKey(a)) return -1;
            if (pos.containsKey(b)) return 1;
            return a - b;
        });

        System.out.println(list);
    }
}
