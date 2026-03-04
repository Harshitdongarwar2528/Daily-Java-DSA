package Strings;

class Rem {
    public String RemBlankSpace(String str) {
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c != ' ' && c != '\t' && c != '\n') {
                result.append(c);
            }
        }
        return result.toString();
    }
}

public class RemoveBlankSpaces {
    public static void main(String[] args) {
        String input = " Hello World! This is  Java";
        Rem r = new Rem();
        String output = r.RemBlankSpace(input);

        System.out.println(output);
    }
}
