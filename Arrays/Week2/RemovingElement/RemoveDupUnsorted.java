package Arrays.Week2.RemovingElement;

import java.util.ArrayList;

class Answer {
    public ArrayList <Integer> removeDuplicates(int [] arr){
        ArrayList<Integer > result = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++){
            boolean found = false;
            for(int j =0 ; j < result.size(); j++){
                if(arr[i] == result.get(j)){
                    found = true;
                    break;
                }
            }
            if(!found){
                result.add(arr[i]);
            }
        }
        return result;
    }
}
public class RemoveDupUnsorted {
    public static void main(String[] args) {
        int [] arr = {1,2,11,3,4,6,4,2,1,3,5,11};
        Answer a = new Answer();
        ArrayList <Integer> result = a.removeDuplicates(arr);
        System.out.println("The Duplicates are ");
        for(int num : result){
            System.out.print(num+ " ");
        } 

    }
}
