import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Frquency {
    public int[] sortByFrequency(int[] arr) {
        HashMap<Integer, Integer> Freq = new HashMap<>();
        for (int num : arr) {
            Freq.put(num, Freq.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr)
            list.add(num);

        Collections.sort(list, (a, b) -> {
            if (!Freq.get(a).equals(Freq.get(b)))
                return Freq.get(b) - Freq.get(a);
            return a - b;
        });

        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}

public class FrequnecySort {
    public static void main(String[] args) {
        Frquency f = new Frquency();

        int[] arr = { 1, 2, 3, 2, 4, 3, 1, 2 };
        int[] res = f.sortByFrequency(arr);

        for (int num : res) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}