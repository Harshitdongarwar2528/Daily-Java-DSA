package Numbers;

class Gp {
    public double SOG(double a, double r, int n) {
        // if ratio is 1
        if (r == 1) {
            return a * n;
        }
        return a * (Math.pow(r, n) - 1) / (r - 1);
    }
}

public class SumOfGPSeries {
    public static void main(String[] args) {

        double a = 2;
        double r = 4;
        int n = 4;

        Gp g = new Gp();
        double result = g.SOG(a, r, n);
        System.out.println("the Sum of GP Series is " + result);
    }
}
