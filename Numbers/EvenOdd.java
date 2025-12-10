package Numbers;

import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your number to check");
        int num = sc.nextInt();
        
        if(num % 2 == 0){
            System.out.println(num+" this is a even number ");
        }else{
            System.out.println(num+" it is a odd number ");
        }
        sc.close();
    }
}
