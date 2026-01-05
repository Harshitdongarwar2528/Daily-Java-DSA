package Arrays;

class Solutions {
    public static int[] insertAtEnding(int[] arr, int x) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = x;
        return newArr;
    }
}

public class InsertElementEnding {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int x = 5;
        arr = Solutions.insertAtEnding(arr, x);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
