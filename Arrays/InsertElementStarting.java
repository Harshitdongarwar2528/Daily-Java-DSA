package Arrays;

class Soln {
    public static int[] insertAtBegining(int[] arr, int x) {
        int[] newArr = new int[arr.length + 1];
        newArr[0] = x;
        for (int i = 0; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }
}

public class InsertElementStarting {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5 };
        int x = 1;
        arr = Soln.insertAtBegining(arr, x);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}