package Strings;

import java.util.*;

public class CharFreq {
    public static void main(String[] args) {
        String str = "Programming".toLowerCase();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);
    }
}
