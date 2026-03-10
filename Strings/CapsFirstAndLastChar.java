package Strings;

class caps {
    public String capitlaizeFirstString(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int start = 0;

        while (start < n) {
            while (start < n && arr[start] == ' ')
                start++;

            if (start >= n) {
                break;
            }
            int end = start;

            while (end < n && arr[end] != ' ') {
                end++;
            }

            if (Character.isLowerCase(arr[start])) {
                arr[start] = Character.toUpperCase(arr[start]);
            }
            if (end - 1 > start && Character.isLowerCase(arr[end - 1])) {
                arr[end - 1] = Character.toUpperCase(arr[end - 1]);
            }
            start = end;

        }
        return new String(arr);

    }
}

public class CapsFirstAndLastChar {
    public static void main(String[] args) {
        caps c = new caps();
        String s = "hello world from chatgpt";

        System.out.println(c.capitlaizeFirstString(s));
    }
}
