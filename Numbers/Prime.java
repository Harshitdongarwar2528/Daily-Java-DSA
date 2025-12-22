package Numbers;
public class Prime{
    public static void main(String[] args) {
        int n = 4;
        boolean isPrime = true;

        if(n < 2){
            isPrime= false;
        } else{
            for(int i = 2 ; i <= Math.sqrt(n) ; i++){
                if(n % i == 0){
                isPrime = false;
                break;
                }
            }
        }
        if(isPrime){
            System.out.println("its a prime number");
        } else{
            System.out.println("its not a prime number ");
        }

    }
}