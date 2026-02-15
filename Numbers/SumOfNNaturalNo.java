package Numbers;

import java.util.Scanner;

class SumOfNaturalNo {
    public int sumOfNaturalNumbers(int N) {
        return (N * (N + 1)) / 2;
    }
}

public class SumOfNNaturalNo {
    public static void main(String[] args) {
        SumOfNaturalNo s = new SumOfNaturalNo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter you Number to check ");
        int N = sc.nextInt();
        System.out.print("The sum of first natural" + N + "Number is " + s.sumOfNaturalNumbers(N));
        sc.close();
    }
}
