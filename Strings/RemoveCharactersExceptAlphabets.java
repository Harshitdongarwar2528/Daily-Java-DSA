package Strings;

class Remove {
    public String RemChar(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                result.append(c);
            }
        }
        return result.toString();
    }
}

public class RemoveCharactersExceptAlphabets {
    public static void main(String[] args) {

        String str = "Hars@!hit";
        Remove r = new Remove();
        System.out.println("Original String: " + str);
        System.out.println("Filtered String: " + r.RemChar(str));
    }

}
