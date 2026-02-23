package Numbers;
class MaximumMinimum{
    public void findMaxMinDigit(int n){
        int maxDigit = 0;
        int minDigit = 9;

        while(n>0){
            int digit = n%10;

            if(digit> maxDigit){
                maxDigit = digit;
            }
            if(digit<minDigit){
                minDigit = digit;

            }
            n = n/10;
        }

        System.out.println("Max Digit "+maxDigit);
        System.out.println("Min Digit "+minDigit);

    }
}
public class MaximumAndMinimumNo{
    public static void main(String[] args) {
        int n = 9826;

        MaximumMinimum mm = new MaximumMinimum();
        mm.findMaxMinDigit(n);
    }
}