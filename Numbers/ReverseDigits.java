class RevDig {
    public int revNum(int n) {
        int revNum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            revNum = revNum * 10 + lastDigit;
            n = n / 10;
        }
        return revNum;
    }

}

public class ReverseDigits {
    public static void main(String[] args) {
        int digit = 12345;
        RevDig rd = new RevDig();
        System.out.println("the reverse is " + rd.revNum(digit));
    }
}