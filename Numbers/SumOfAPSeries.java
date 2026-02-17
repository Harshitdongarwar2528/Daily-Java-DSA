package Numbers;

class SumOfAp {
    public static float SumOfAPSer(float a, float d, int n) {
        // Formula for sum of AP series: (n / 2) * (2a + (n-1) * d)
        float sum = (n / 2.0f) * (2.0f * a + (n - 1) * d);

        return sum;
    }
}

public class SumOfAPSeries {
    public static void main(String[] args) {
        float a = 1.5f, d = 3f;
        int n = 5;

        float sum = SumOfAp.SumOfAPSer(a, d, n);
        System.out.println("Sum of given Ap Series: " + sum);
    }
}
