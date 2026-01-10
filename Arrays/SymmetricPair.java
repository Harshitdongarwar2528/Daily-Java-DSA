package Arrays;
class CheckSymmetry{
    public void Symmetry(int [][]arr){
        System.out.println("the Symmetric pairs are ");
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[j][0] == arr[i][1] && arr[j][1] == arr[i][0]){
                    System.out.println("("+arr[i][1]+ " " + arr[i][0]+ ") ");
                }
            }
        }
    }
}
public class SymmetricPair{
    public static void main(String[] args) {
        int [][]arr = {{1,2},{2,1},{4,7},{3,5},{7,4}};
        CheckSymmetry c = new CheckSymmetry();
        c.Symmetry(arr); 
    }
}