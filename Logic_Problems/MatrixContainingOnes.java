// A parking lot in a mall has RxC number of parking spaces. Each parking space will either be  empty(0) or full(1). The status (0/1) of a parking space is represented as the element of the matrix. The task is to find index of the prpeinzta row(R) in the parking lot that has the most of the parking spaces full(1).

// Note :
// RxC- Size of the matrix
// Elements of the matrix M should be only 0 or 1.

// Example 1:
// Input :
// 3   -> Value of R(row)
// 3    -> value of C(column)
// [0 1 0 1 1 0 1 1 1] -> Elements of the array M[R][C] where each element is separated by new line.
// Output :
// 3  -> Row 3 has maximum number of 1’s
package Logic_Problems;

import java.util.Scanner;

public class  MatrixContainingOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R= sc.nextInt();
        int C= sc.nextInt();

        int[][] matrix = new int[R][C];

        for (int i=0 ; i < R ; i++){
            for(int j =0 ; j<C ; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int maxCount = 0;
        int rowIndex = 0;

        for (int i =0 ; i < R; i++){
            int count = 0;

            for (int j =0 ; j < C; j++){
                if(matrix[i][j]==1){
                    count++;
                }
            }

            if(count > maxCount){
                maxCount = count;
                rowIndex = i+1; // +1 because rows start from 1
            }
        }
        System.out.println(rowIndex);
        sc.close();
    }
}
