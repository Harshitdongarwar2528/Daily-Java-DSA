package Arrays.Week2.AddingElement;
class SOL {
    public static int[] InsertAtAPos(int [] arr, int pos , int x){
        int [] newArr = new int [arr.length+1];
        for(int i = 0 ; i < arr.length ; i ++){
            newArr[i] = arr[i];
        }
        newArr[pos] = x;

        for(int i = pos ; i < arr.length ; i++){
            newArr[i+1]=arr[i];
        }
        return newArr;
    }
}
public class InsertAtASpecificPosition{
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,6,7};
        int x = 5 , pos = 4;
        arr = SOL.InsertAtAPos(arr, pos, x);
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}