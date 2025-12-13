package Numbers;

public class Palindrome {
    public static void main(String[] args) {
       int n = 122 ; 
       int original = n ;
       int reversed = 0 ;
       while (n != 0 ){
        int digit = n % 10;
        reversed = reversed * 10+ digit;
        n = n/10;
       }
       if(original == reversed){
        System.out.println(original+" its a palindrome");
       }else {
        System.out.println(original + " it is not a palindrome");
       }
    }
}
