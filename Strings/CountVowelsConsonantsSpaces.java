package Strings;

class Count {
    public void solve(String str) {
        int vowels = 0, consonants = 0, spaces = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            } else if (ch == ' ') {
                spaces++;
            }

        }
        System.out.println("Vowels :" + vowels);
        System.out.println("Consonants :" + consonants);
        System.out.println("WhiteSpaces :" + spaces);
    }
}

public class CountVowelsConsonantsSpaces {
    public static void main(String[] args) {
        String str = "My name is Harshit";
        Count c = new Count();
        c.solve(str);
    }
}
