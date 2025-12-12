package Numbers;
import java.util.*;
public class PositiveAndNegative{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("please enter your number to check ");
        int num = sc.nextInt();
        if(num == 0 ){
            System.out.println("the number is zero");
        } else if (num < 0){
            System.out.println("the number is negative ");
        } else {
            System.out.println("the number is positive ");
        }
        sc.close();
    }
}


