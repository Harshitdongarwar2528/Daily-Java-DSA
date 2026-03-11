package Numbers;

class LCM {
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public int calculateLCM(int a, int b) {
        int g = gcd(a, b);
        return (a * b) / g;
    }
}

public class LCMOfTwoNumbers {
    public static void main(String[] args) {
        int a = 4;
        int b = 8;
        LCM l = new LCM();
        int lcm = l.calculateLCM(a, b);
        System.out.println("The LCM of the two numbers is " + lcm);
    }
}
