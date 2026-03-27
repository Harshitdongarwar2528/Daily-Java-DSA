// (Expected O(1))
//
// In the Kingdom of Arithmoria, a ritual staircase has n glowing steps.
// The first step emits energy 1, the second 2, the third 3, and so on.
//
// To activate the royal beacon, the total cumulative energy of all n steps 
// must be calculated.
//
// However, due to time constraints, the calculation must be performed in 
// constant time.
//
// Compute the total energy emitted by the staircase.
//
// Sample Test Case:
// Input:
// n = 1
//
// Output:
// 1
package Logic_Problems;
import java.util.*;
public class SumOfNNaturalNumbers {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int sum = (n * (n+1)) / 2;
       
        System.out.println(sum);
    }
}
