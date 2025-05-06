import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static int[] insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) { // unsorted part
            int temp = arr[i];
            int j = i - 1; // sorted part

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j]; // shifting larger elements to temp by 1 pos
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        boolean isSwapped;

        for (int i = 0; i < n - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (isSwapped == false) {
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = arr;
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(insertionSort(arr)));
        System.out.println(Arrays.toString(bubbleSort(arr1)));
    }
}
