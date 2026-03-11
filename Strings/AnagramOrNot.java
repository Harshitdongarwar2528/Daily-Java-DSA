package Strings;

class Anagram{
    public boolean checkAnagrams(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;

        }

        int [] freq = new int[26];

        for(int i = 0 ; i < str1.length();i++){
            freq [str1.charAt(i) - 'A']++;
        }

        for(int i = 0; i < str2.length(); i++){
            freq[str2.charAt(i) - 'A']--;
        }

        for(int i =0 ; i< 26 ; i++){
            if(freq[i] != 0){
                return false;
            }
        }
        return true;
    }
}
public class AnagramOrNot {
    public static void main(String[] args) {
        Anagram a = new Anagram();
        String str1 = "INTEGER";
        String str2 = "TEGERNI";

        if(a.checkAnagrams(str1, str2)){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }
}
