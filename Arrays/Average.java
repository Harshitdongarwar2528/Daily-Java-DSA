package Arrays;

class AvgSolution {
    void average(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;
        System.out.println("The Average Of the Elements is " + avg);
    }
}

public class Average {
    public static void main(String[] args) {
        AvgSolution a = new AvgSolution();
        int[] arr = { 1, 2, 3, 4, 5 };
        a.average(arr);
    }
}
