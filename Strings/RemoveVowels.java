package Strings;

class RemVow {
    public String removeVowels(String s) {
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {

            char lower = Character.toLowerCase(ch);

            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {

                continue;
            }
            result.append(ch);
        }
        return result.toString();
    }
}

public class RemoveVowels {
    public static void main(String[] args) {
        String s = "Hello World";
        RemVow rv = new RemVow();
        System.out.println(rv.removeVowels(s));

    }
}
