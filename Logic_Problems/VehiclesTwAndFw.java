package Logic_Problems;
import java.util.*;
public class VehiclesTwAndFw {
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number of vehciles");
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



