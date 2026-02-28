
import java.util.*;
public class StarsAndHashes {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int star = 0 , hash = 0;
        for(int i  = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == ('*')){
                star++;
            } else if ( str.charAt(i)== ('#')){
                hash++;
            }
        }
        System.out.println(star-hash);
        sc.close();
    }
}

