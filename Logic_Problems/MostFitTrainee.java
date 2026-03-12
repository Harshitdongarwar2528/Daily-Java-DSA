// Selection of MPCS exams include a fitness test which is conducted on ground. There will be a batch of 3 trainees, appearing for running test in track for 3 rounds. You need to record their oxygen level after every round. After trainee are finished with all rounds, calculate for each trainee his average oxygen level over the 3 rounds and select one with highest oxygen level as the most fit trainee. If more than one trainee attains the same highest average level, they all need to be selected.

// Display the most fit trainee (or trainees) and the highest average oxygen level.

// Note:

// The oxygen value entered should not be accepted if it is not in the range between 1 and 100.
// If the calculated maximum average oxygen value of trainees is below 70 then declare the trainees as unfit with meaningful message as “All trainees are unfit.
// Average Oxygen Values should be rounded.
// Example 1:
// INPUT VALUES
// 95
// 92
// 95
// 92
// 90
// 92
// 90
// 92
// 90

// OUTPUT VALUES
// Trainee Number : 1
// Trainee Number : 3

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
                    sc.close();

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
            sc.close();

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