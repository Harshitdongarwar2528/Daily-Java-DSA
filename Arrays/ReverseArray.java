package Arrays;

public class ReverseArray {

    public static void Reverse(int[] arr) {
        //loops for iterating
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.print("The original Array is ");
        printArray(arr);

        Reverse(arr);

        System.out.print("The reverse Array is ");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        //condition 
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
