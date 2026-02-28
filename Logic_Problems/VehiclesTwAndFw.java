// Problem Statement – An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A company manager wants to make the production of both types of vehicle according to the given data below:

// 1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
// 2nd data, Total number of wheels = W
// The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.
// Example :

// Input :
// 200  -> Value of V
// 540   -> Value of W

// Output :
// TW =130 FW=70

// Explanation:
// 130+70 = 200 vehicles
// (70*4)+(130*2)= 540 wheels

package Logic_Problems;
import java.util.*;
public class VehiclesTwAndFw {
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number of vehicles");
        int v = sc.nextInt();
        System.out.println("please enter the number of wheels");
        int w = sc.nextInt();
    
        float res = ((4*v)-w)/2;
        if( (w>=2) && (w%2==0) && v<w){
            System.out.println("TW =" +res + " FW ="+(v-res));
        }else{
            System.out.println("Invalid Input");
        }
        sc.close();
    
    }
}



