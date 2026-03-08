package Logic_Problems;

import java.util.Scanner;

public class MostFitTrainee {
    public static void main(String[] args) {

        int[][] trainee = new int[3][3];
        int[] average = new int[3];
        int max = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                trainee[i][j] = sc.nextInt();

                if (trainee[i][j] < 1 || trainee[i][j] > 100) {
                    System.out.println("INVALID INPUT");
                    return;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            int sum = 0;

            for (int j = 0; j < 3; j++) {
                sum += trainee[i][j];
            }

            average[i] = Math.round(sum / 3.0f);

            if (average[i] > max) {
                max = average[i];
            }
        }

        if (max < 70) {
            System.out.println("All trainees are unfit");
            return;
        }

        for (int i = 0; i < 3; i++) {
            if (average[i] == max) {
                System.out.println("Trainee Number : " + (i + 1));
            }
        }
        sc.close();

    }
}