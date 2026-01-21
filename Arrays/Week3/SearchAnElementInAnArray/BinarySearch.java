package Arrays.Week3.SearchAnElementInAnArray;

import java.util.Arrays;

public class BinarySearch {
    public static void main (String [] args){
        int [] arr = {6,4,5,7,10,9};
        Arrays.sort(arr);
        int n = arr.length;
        int k = 9;
        int low = 0 ;
        int high = n-1;
        int ans = -1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] > k){
                high = mid-1;
            } else if (arr[mid]< k){
                low = mid+1;
            } else {
                ans = mid;
                break;
            }
        }
        System.out.println("The element is present in "+ans+" index");
    }
}
